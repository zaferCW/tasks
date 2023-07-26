package MeryemT.task24.task03;

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


Book book = new Book("sefiller","hugo");

    System.out.println("book = " + book);
    System.out.println("book.toString() = " + book.toString());

}


}//class sonu
class Book {
    //fields
    private String bookName;
    private String authorNamee;

    public Book() {

    }

    public Book(String bookName, String authorNamee) {
        this.bookName = bookName;
        this.authorNamee = authorNamee;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorNamee() {
        return authorNamee;
    }

    public void setAuthorNamee(String authorNamee) {
        this.authorNamee = authorNamee;
    }

    @Override

    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorNamee='" + authorNamee + '\'' +
                '}';
    }
}


