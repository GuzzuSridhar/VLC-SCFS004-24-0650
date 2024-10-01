package arraylist;

public class Book {
    int bookId;
    String bookName;
    String author;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;

    }

    @Override
    public String toString() {
        return "bookId=" + bookId + ", bookName=" + bookName + ", author=" + author;
    }

}
