package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        InputLoop il = new InputLoop();
        int x = il.getValidInt();
        System.out.println(x);
    }

    int getValidInt() {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        boolean isValid = false;

        System.out.print("Enter Age: ");
        while (!isValid) {
            try {
                age = scan.nextInt();
                // if (age > 0)
                isValid = true;
                // else
                // System.out.println("Age cannot be neagtive or zero");
            } catch (InputMismatchException e) {
                System.out.print("Enter Valid number for age: ");
                scan.nextLine();
            }
        }
        scan.close();
        return age;
    }
}
