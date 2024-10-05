package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputErrorDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        try {
            int age = scan.nextInt();
            System.out.println(age);
        } catch (InputMismatchException ie) {
            System.out.println("Please enter a valid age");
        }

    }
}
