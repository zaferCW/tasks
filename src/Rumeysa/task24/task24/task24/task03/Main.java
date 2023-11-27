package Rumeysa.task24.task24.task24.task03;

import java.util.Scanner;

public class Main {

/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the book name?");
        String name = input.nextLine().toUpperCase();
        System.out.println("who is the author?");
        String author = input.nextLine().toUpperCase();

        Book book1 = new Book(name, author);
        System.out.println(book1);
    }

}
class Book{
    private String bookName;
    private String authorName;

    public Book() {
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "bookName is " + bookName +
                ", author is " + authorName;
    }
}
