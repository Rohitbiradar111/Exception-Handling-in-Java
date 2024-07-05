//This program explains Exception Handling in Java

import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number = ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number = ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("C = "+c);
            sc.close();
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Invalid Denominator");
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("After try-catch block");
        }
    }
}