package library;

import java.util.ArrayList;

public class Library {
  ArrayList<Book> availableBooks;
  ArrayList<User> users;

    public Library() {
    availableBooks = new ArrayList<>();
    users = new ArrayList<>();
  }

  public void addBook(Book book) {
    if (book == null) {
      throw new IllegalArgumentException("Invalid book.");
    }
    availableBooks.add(book);
  }

  public void registerUser(User user) {
    if(user == null) throw new IllegalArgumentException("Invalid user.");
    users.add(0, user);
  }

  public void displayAvailableBooks() {
    for (Book book : availableBooks) {
            System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
    }
  }

  /**
     * Borrow a book from the library.
     *
     * @param book The book to borrow.
     * @param user The user borrowing the book.
     * @throws LibraryException If the book or user is null, or if the user is not registered or the book is not available.
   */
  public void borrowBook(Book book, User user) throws LibraryException {
        if (book == null || user == null) {
      throw new IllegalArgumentException("Illegal argument.");
    }
    if (!users.contains(user)) {
      throw new LibraryException("User is not registered to this library.");
    }
    if (!availableBooks.contains(book)) {
            throw new LibraryException("Book is not available.");
    }
    availableBooks.remove(book);
    user.borrowBook(book);
  }

  /**
     * Return a book to the library.
     *
     * @param book The book to return.
     * @param user The user returning the book.
     * @throws LibraryException If the book or user is null, or if the user is not registered.
   */
  public void returnBook(Book book, User user) throws LibraryException {
        if (book == null || user == null) {
      throw new IllegalArgumentException("Illegal argument.");
    }
    if (!users.contains(user)) {
      throw new LibraryException("Not registered User.");
    }
    user.returnBook(book);
    availableBooks.add(0, book);
  }
}