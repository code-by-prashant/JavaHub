import java.util.Scanner;

class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();

		System.out.print("Enter your id: ");
		int id = sc.nextInt();

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		System.out.print("Enter your Designation: ");
		String desg = sc.next();

		System.out.print("Enter your salary: ");
		float salary = sc.nextFloat();

		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
		sc.close();
	}
}