package library;

public class Book {
  private String title;
  private String author;
  private String isbn;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  /**
   * @return
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return
   */
  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + "]";
  }

  // m

}