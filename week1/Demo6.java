
class A{
	String name;

	A(){
        System.out.print("Class A");

    	}
	void abc(){
		System.out.println("abc method");
	}
}

class Demo6{
	public static void main(String[] args) {
	System.out.println("Demo6");
	A a = new A();
	a.abc();
	a.abc();
	a.abc();
    }
}