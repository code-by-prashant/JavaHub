import java.util.Scanner;

class Clerk {
	String name;
	int id;
	int age;
	String desg = "Clerk";
	float salary = 350000;

	Clerk() {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Clerk----------");

		System.out.print("Enter your name: ");
		name = sc.next();

		System.out.print("Enter your id: ");
		id = sc.nextInt();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.println("");

	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
		System.out.println("");
	}
}

class Manager {
	String name;
	int id;
	int age;
	String desg = "Manager";
	float salary = 900000;

	Manager() {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Manager----------");

		System.out.print("Enter your name: ");
		name = sc.next();

		System.out.print("Enter your id: ");
		id = sc.nextInt();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.println("");

	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
		System.out.println("");
	}
}

class Developer {
	String name;
	int id;
	int age;
	String desg = "Developer";
	float salary = 45000;

	Developer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Developer----------");

		System.out.print("Enter your name: ");
		name = sc.next();

		System.out.print("Enter your id: ");
		id = sc.nextInt();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.println("");
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
		System.out.println("");
	}
}

class Tester {
	String name;
	int id;
	int age;
	String desg = "Tester";
	float salary = 45000;

	Tester() {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Tester----------");

		System.out.print("Enter your name: ");
		name = sc.next();

		System.out.print("Enter your id: ");
		id = sc.nextInt();

		System.out.print("Enter your age: ");
		age = sc.nextInt();

		System.out.println("");
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + desg);
		System.out.println("Salary: " + salary);
		System.out.println("");
	}
}

class Project {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {

			System.out.println("1. Manager");
			System.out.println("2. Developer");
			System.out.println("3. Tester");
			System.out.println("4. Clerk");
			System.out.println("");

			System.out.print("What's your Designation? Enter number: ");
			num = sc.nextInt();

			if (num == 1) {
				Manager manager = new Manager();
				manager.display();
			}

			if (num == 2) {
				Developer developer = new Developer();
				developer.display();
			}

			if (num == 3) {
				Tester tester = new Tester();
				tester.display();
			}

			if (num == 4) {
				Clerk clerk = new Clerk();
				clerk.display();
			} else if (num >= 5) {
				System.out.println("Thank you");
				System.exit(0);
			}

		} while (num <= 4);
		sc.close();
	}

}