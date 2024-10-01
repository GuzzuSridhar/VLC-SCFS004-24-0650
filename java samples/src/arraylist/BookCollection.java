package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCollection {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name = "", auth = "";
        int id = 0, more = 1;

        while (more != 0) {
            System.out.print("Enter Book Name: ");
            name = input.nextLine();
            System.out.print("Enter Book ID: ");
            id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Autohor: ");
            auth = input.nextLine();
            System.out.print("Do you want to add another book? (1/0) ");
            more = input.nextInt();
            input.nextLine();
            books.add(new Book(id, name, auth));
        }

        // System.out.println(books.get(0)); // when a object is printed the built in
        // toString() is called

        for (Book book : books) {
            // System.out.println(book.bookId + " - " + book.bookName + " - " +
            // book.author); // without the toString()
            System.out.println(book); // print the same format with the toString()
        }

        input.close();

    }
}
