package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int res = a/b;
            System.out.println(res);
        }
        catch (ArithmeticException ae) {
            System.out.println("Exception: divideByZero");
        }
        System.out.println("Program executed successfully");
    }
}
