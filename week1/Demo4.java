import java.util.Scanner;

class A {
	String name;
	int id;
	int age;
	String desg;
	float salary;

	A() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = sc.next();

		System.out.print("Enter your id: ");
		id = sc.nextInt();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.print("Enter your Designation: ");
		desg = sc.next();

		System.out.print("Enter your salary: ");
		salary = sc.nextFloat();
		sc.close();
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
	}
}

class Demo4 {
	public static void main(String[] args) {
		System.out.println("Demo4");
		A a = new A();
		a.display();
	}
}