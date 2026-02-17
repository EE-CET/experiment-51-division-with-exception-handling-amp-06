import java.util.Scanner;

public class DivisionHandling {
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int z = a / b;
            System.out.println( z);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
    }
}

        

