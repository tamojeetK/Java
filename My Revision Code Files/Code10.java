//Exception Handling

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Num1: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter Num2: ");
            double num2 = sc.nextDouble();

            double div = num1 / num2;

            System.out.println("The result is: " + div);
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
        finally{
            sc.close();
        }

    }
}