package construct.ex;

public class BookMain {
  public static void main(String[] args) {
    Book book = new Book();
    book.displayInfo();

    Book book1 = new Book("he", "seo");
    book1.displayInfo();

    Book book2 = new Book("her", "seo", 700);
    book2.displayInfo();
  }
}
