import java.util.Scanner;

public class Maximum {

    static int findMax(int num1, int num2, int num3) {

	// set num1 as maximum
        int max = num1;
        
	// compare num2 with the current maximum
        if (num2 > max) {
            max = num2;
        }
        
        // compare num3 with the current maximum
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
        int maximum = findMax(number1, number2, number3);

        System.out.println("The maximum of the three numbers is: " + maximum);
        sc.close();
        
    }
}
