package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Program to demonstrate the use of multiple Catch blocks and Throw keyword.
public class CitySelector {

    //  displayCities takes an array of cities as a parameter and displays them in a formatted manner.
    public static void displayCities(String[] cities) {
        System.out.println("Available cities: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i]);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Welcome to City Selector!\n\n");
            System.out.print("Please enter your age: ");
            int age = sc.nextInt();

            String[] cities = {"Delhi", "Mumbai", "Pune", "Nashik", "Lucknow"};
            
            if (age > 18) {
                System.out.println("You are an adult. Let's explore some cities!");

                // Display the available cities
                displayCities(cities);

                System.out.print("Choose your city: ");
                int choice = sc.nextInt();

                if (choice >= 1 && choice <= cities.length) {
                    String selectedCity = cities[choice - 1];
                    System.out.println("You have selected: " + selectedCity + ". Enjoy your visit!");

                    // Demonstrate NullPointerException
                    String nullString = null;
                    // Accessing length on null reference
                    int nullStringLength = nullString.length(); 
                    System.out.println("Length of nullString: " + nullStringLength);

                } else {
                    // Throw exception for invalid city choice
                    throw new ArrayIndexOutOfBoundsException();
                }
                /*
                In Java, the program can automatically catch some exceptions based on their type, 
                but in the case of `ArrayIndexOutOfBoundsException`, it is not automatically caught. 

                The `ArrayIndexOutOfBoundsException` is thrown explicitly using the `throw` keyword 
                when the user selects an invalid city choice.
                */
            } else {
                displayCities(cities);
                System.out.println("You are a minor. Enjoy the city adventures with supervision!");
            }
        } 
        catch (NullPointerException npe) {
            System.out.println("Oops! Something went wrong. Please try again later.");
        } 
        catch (InputMismatchException ime) {
            System.out.println("Invalid input! Please enter a valid number.");
        } 
        catch (ArrayIndexOutOfBoundsException aioob) {
            System.out.println("Invalid choice! Please select a city from the given options.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        
        System.out.println("\nThank you for using City Selector!");
    }
}
