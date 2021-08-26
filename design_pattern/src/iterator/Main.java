package iterator;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.appendBook(new Book("Hello"));
    bookShelf.appendBook(new Book("Hedfbpuoblo"));
    bookShelf.appendBook(new Book("Hlfbnsoifbl"));
    bookShelf.appendBook(new Book("Hlfvfvvfvfvfvlo"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
