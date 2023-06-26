class A extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("A class: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("exception");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("    B class: " + i);
            Thread.sleep(1000);
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
