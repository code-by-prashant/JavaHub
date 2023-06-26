
class A{
	int a = 1000;
	
	// to demonstrate the use of this keyword
	void abc(int a){
		System.out.println("Hi Class A " +this.a);
		System.out.println("Hi Class A " +a);
	}
}

class B extends A{
	int a = 100;
	
	// to demonstrate the use of this and super keywords
	void xyz(int a){
		System.out.println("Class B " +a);
		System.out.println("Class B " +this.a);
		System.out.println("Class A " +super.a);
	}
}

class Constructor{
	public static void main(String[] args) {
	A a = new A();
	a.abc(100);

	B b = new B();
	b.xyz(10);
    }
}