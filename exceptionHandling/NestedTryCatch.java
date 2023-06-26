package exceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        int arr[] = {0,10,20,30,40,50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            float a = sc.nextInt();
            float b = sc.nextInt();

            float res = a / b;
            System.out.println(a + " / " + b + " = "+ res);

            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                for (index = 0; index < arr.length; index++) {
                    
                    if (index >= 6) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                System.out.println("You selected: " + arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero!");
        }
        finally{
            System.out.println("Success");
        }
    }
}
