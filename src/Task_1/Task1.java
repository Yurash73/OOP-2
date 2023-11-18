package Task_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        Book book1 = new Book("Крылов ИА","Басни");
        Book book2 = new Book("Горький АМ","На Дне");
        Book book3 = new Book("Стругацкие","Пикник на обочине");
        Book book4 = new Book("Лукьяненко Сергей","Дозор");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);

        String [] arrayOfBooks = new String[] {"Приключения","Словарь","Энциклопедия"};


        Reader student1 = new Reader("Иванов ИИ", 12345,"ФПМ",
                new Date(2010,6,23),"+79047895252");
        Reader student2 = new Reader("Петров ПП", 12321,"Исторический",
                new Date(2011,3,05),"+79501234567");
        Reader student3 = new Reader("Ковалева МА", 54321,"Филологический",
                new Date(2008,10,11),"+79121234567");
        Reader student4 = new Reader("Смирнова ЕВ", 22334,"Геологический",
                new Date(2009,12,30),"+79505556677");

         student1.takeBook(3);
         student2.takeBook(arrayOfBooks);
         student3.takeBook(listOfBooks);

         student4.returnBook(5);
         student1.returnBook(arrayOfBooks);
         student3.returnBook(listOfBooks);

    }
}
