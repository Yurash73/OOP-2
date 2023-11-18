package Task_1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class Reader {
    private String fullName;

    private int ticket;
    private String facility;
    private Date birthday;
    private String phoneNumber;

    public Reader(String fullName, int ticket, String facility, Date birthday, String phoneNumber) {
        this.fullName = fullName;
        this.ticket = ticket;
        this.facility = facility;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberBooks) {

        System.out.println(this.fullName + " взял " + numberBooks + " книг.");
    }

    public void takeBook(String[] booksName) {

        StringBuilder stringBuilder = new StringBuilder();
        stream(booksName).forEach(val -> stringBuilder.append(val + ","));
        stringBuilder.append("\n");

        System.out.print(this.fullName + " взял  книги: " +
                stringBuilder.toString());
    }

    public void takeBook(List<Book> bookList) {
        StringBuilder stringBuilder = new StringBuilder();
        bookList.stream().forEach(val -> stringBuilder.append(val.getBookName() + ","));
        stringBuilder.append("\n");

        System.out.println(this.fullName + " взял  книги: " +
                stringBuilder.toString());

    }

    public void returnBook(int numberBooks) {
        System.out.println(this.fullName + " вернул " + numberBooks + " книг.");

    }

    public void returnBook(String[] booksName) {

        StringBuilder stringBuilder = new StringBuilder();
        stream(booksName).forEach(val -> stringBuilder.append(val + ","));
        stringBuilder.append("\n");

        System.out.print(this.fullName + " вернул  книги: " +
                stringBuilder.toString());
    }

    public void returnBook(List<Book> bookList) {
        StringBuilder stringBuilder = new StringBuilder();
        bookList.stream().forEach(val -> stringBuilder.append(val.getBookName() + ","));
        stringBuilder.append("\n");

        System.out.println(this.fullName + " вернул  книги: " +
                stringBuilder.toString());


    }

}
