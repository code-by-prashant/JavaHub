package project;

import java.util.*;

abstract class A {
    private String name;
    private int age;
    protected int salary;
    protected String designation;

    Scanner sc = new Scanner(System.in);

    A() {
        try {
            System.out.println("Enter the Name:");
            name = sc.next();

            System.out.println("Enter Age:");
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void display() {
        System.out.println("\nNAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SALARY: " + salary);
        System.out.println("DESIGNATION: " + designation);
    }

    public abstract void riseSalary();
}

final class Clerk extends A {
    private static final int BASE_SALARY = 10000;
    private static final int SALARY_INCREMENT = 5000;

    public Clerk() {
        salary = BASE_SALARY;
        designation = "Clerk";
    }

    public void riseSalary() {
        salary += SALARY_INCREMENT;
        System.out.println("Incremented Salary for Clerk: " + salary);
    }
}

final class Programmer extends A {
    private static final int BASE_SALARY = 15000;
    private static final int SALARY_INCREMENT = 10000;

    public Programmer() {
        salary = BASE_SALARY;
        designation = "Programmer";
    }

    public void riseSalary() {
        salary += SALARY_INCREMENT;
        System.out.println("Incremented Salary for Programmer: " + salary);
    }
}

final class Manager extends A {
    private static final int BASE_SALARY = 20000;
    private static final int SALARY_INCREMENT = 15000;

    public Manager() {
        salary = BASE_SALARY;
        designation = "Manager";
    }

    public void riseSalary() {
        salary += SALARY_INCREMENT;
        System.out.println("Incremented Salary for Manager: " + salary);
    }
}

public class NewProject {
    public static void main(String args[]) {
        int menuChoice = 0, subMenuChoice = 0;
        ArrayList<A> list = new ArrayList<>();

        do {
            System.out.println("--------------------------------");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Rise Salary");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.println("Enter your Choice: ");

            try (Scanner sc1 = new Scanner(System.in)) {
                menuChoice = sc1.nextInt();

                if (menuChoice == 1) {
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("1. Clerk");
                        System.out.println("2. Programmer");
                        System.out.println("3. Manager");
                        System.out.println("4. Exit");
                        System.out.println("--------------------------------");
                        System.out.println("Enter your Choice: ");

                        try (Scanner sc2 = new Scanner(System.in)) {
                            subMenuChoice = sc2.nextInt();
                            switch (subMenuChoice) {
                                case 1:
                                    list.add(new Clerk());
                                    break;
                                case 2:
                                    list.add(new Programmer());
                                    break;
                                case 3:
                                    list.add(new Manager());
                                    break;
                            }
                        }
                    } while (subMenuChoice != 4);
                }

                if (menuChoice == 2) {
                    Iterator<A> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        A a = iterator.next();
                        a.display();
                    }
                }

                if (menuChoice == 3) {
                    Iterator<A> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        A a = iterator.next();
                        a.riseSalary();
                    }
                }
            }
        } while (menuChoice != 4);
    }
}
