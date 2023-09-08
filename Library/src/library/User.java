package library;

import java.util.ArrayList;

public class User {
  private String name;
  private String email;
  private ArrayList<Book> borrowedBookList;

  /**
   * Constructor for User class.
   * @param name The name of the user.
   * @param email The email of the user.
   * @throws LibraryException If name or email is null.
   */
  public User(String name, String email) throws LibraryException {
      if (name != null && email != null) {
        this.name = name;
        this.email = email;
        this.borrowedBookList = new ArrayList<>();
      } else {
            throw new LibraryException("Empty user argument for user initialization.");
      }
  }

  /**
   * Checks if the user has borrowed a specific book.
   * @param book The book to check.
   * @return True if the user has borrowed the book, false otherwise.
   */
  public boolean hasBorrowedBook(Book book) {
    return borrowedBookList.contains(book);
  }

  /**
   * Adds a book to the user's borrowed book list.
   * @param book The book to borrow.
   */
  public void borrowBook(Book book) {
    this.borrowedBookList.add(book);
  }

  /**
   * Removes a book from the user's borrowed book list.
   * @param book The book to return.
   * @throws LibraryException If the book is not borrowed by the user.
   */
  public void returnBook(Book book) throws LibraryException {
    if (hasBorrowedBook(book)) {
      borrowedBookList.remove(book);
    } else {
            throw new LibraryException("Book not borrowed by user.");
    }
  }

  /**
   * Gets the name of the user.
   * @return The name of the user.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the email of the user.
   * @return The email of the user.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the list of borrowed books by the user.
   * @return The list of borrowed books.
   */
  public ArrayList<Book> getBorrowedBookList() {
    return borrowedBookList;
  }

  // toæ
}