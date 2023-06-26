import java.util.Date;

public class TimeThread implements Runnable {

    public void run() {
        int ss = 0;
        int mm = 0;
        int hh = 0;

        try {

            for (int i = 0; i < 10000; i++) {
                System.out.println(hh +" : " + mm +" : "  + i );
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            // TODO: Handle the exception gracefully
        }
    }

    public static void main(String[] args) {
        // Create a new thread and start it
        Thread thread = new Thread(new TimeThread());
        thread.start();
    }
}
