import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Employee {
    String name;
    int id;
    int age;
    String desg;
    float salary;

    Employee(String desg, float salary) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        name = sc.next();

        System.out.print("Enter your id: ");
        id = sc.nextInt();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        this.desg = desg;
        this.salary = salary;
    }

    abstract void raiseSalary();

    void display() {
        System.out.println("    Name: " + name);
        System.out.println("    ID: " + id);
        System.out.println("    Age: " + age);
        System.out.println("    Designation: " + desg);
        System.out.println("    Current Salary: " + salary + "\n");
    }
}

interface Requirements {
    void cab();
}

class Manager extends Employee {
    Manager() {
        super("Manager", 900000);
        System.out.println("\n----------Welcome to the Manager's Office----------");
    }

    void raiseSalary() {
        salary += 30000;
        System.out.println("    Congratulations! Your salary after appraisal is: " + salary);
    }
}

class Developer extends Employee {
    Developer() {
        super("Developer", 45000);
        System.out.println("\n----------Welcome to the Developer's Den----------");
    }

    void raiseSalary() {
        salary += 20000;
        System.out.println("    Great job! Your salary after appraisal is: " + salary);
    }
}

class Tester extends Employee {
    Tester() {
        super("Tester", 45000);
        System.out.println("\n----------Welcome to the Testing Arena----------");
    }

    void raiseSalary() {
        salary += 20000;
        System.out.println("    Well done! Your salary after appraisal is: " + salary);
    }
}

class Clerk extends Employee {
    Clerk() {
        super("Clerk", 350000);
        System.out.println("\n----------Welcome to the Clerk's Workspace----------");
    }

    void raiseSalary() {
        salary += 10000;
        System.out.println("    Keep up the good work! Your salary after appraisal is: " + salary);
    }
}

class Inheritance {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("\nChoose one of the following roles:");
            System.out.println("\n1. Manager");
            System.out.println("2. Developer");
            System.out.println("3. Tester");
            System.out.println("4. Clerk");
            System.out.println("5. Exit\n");

            System.out.print("What's your designation? Please enter the corresponding number:");
            num = sc.nextInt();

            if (num == 1) {
                Manager manager = new Manager();
                manager.display();
                manager.raiseSalary();
            } else if (num == 2) {
                Developer developer = new Developer();
                developer.display();
                developer.raiseSalary();
            } else if (num == 3) {
                Tester tester = new Tester();
                tester.display();
                tester.raiseSalary();
            } else if (num == 4) {
                Clerk clerk = new Clerk();
                clerk.display();
                clerk.raiseSalary();
            } else if (num == 5) {
                System.out.println("Thank you");
                System.exit(0);
            }

        } while (num <= 4);

        sc.close();
        } 
        
        catch (InputMismatchException i) {
            System.out.println("Please enter correct input.");
        }
        catch (NullPointerException n) {
            System.out.println("Please enter a value.");
        }

        
    }

}
