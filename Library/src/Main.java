import library.Book;
import library.Library;
import library.User;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Hello, World!");
            Library l1 = new Library();

            User user1 = new User("Ajay", "ajay@example.com"); 
            User user2 = new User("Rahul", "rahul@example.com"); 
            User user3 = new User("Priya", "priya@example.com"); 
            User user4 = new User("Neha", "neha@example.com"); 
            User user5 = new User("Amit", "amit@example.com"); 
            User user6 = new User("Anjali", "anjali@example.com"); 
            User user7 = new User("Vikram", "vikram@example.com"); 
            User user8 = new User("Sneha", "sneha@example.com"); 
            User user9 = new User("Rajesh", "rajesh@example.com"); 
             User user10 = new User("Pooja", "pooja@example.com"); 
             
            Book book1 = new Book("Book 1", "Author 1", "ISBN 1"); 
            Book book2 = new Book("Book 2", "Author 2", "ISBN 2"); 
            Book book3 = new Book("Book 3", "Author 3", "ISBN 3"); 
            Book book4 = new Book("Book 4", "Author 4", "ISBN 4"); 
            Book book5 = new Book("Book 5", "Author 5", "ISBN 5"); 
            Book book6 = new Book("Book 6", "Author 6", "ISBN 6"); 
            Book book7 = new Book("Book 7", "Author 7", "ISBN 7"); 
            Book book8 = new Book("Book 8", "Author 8", "ISBN 8"); 
            Book book9 = new Book("Book 9", "Author 9", "ISBN 9"); 
            Book book10 = new Book("Book 10", "Author 10", "ISBN 10"); 

            l1.addBook(book10);
            l1.addBook(book9);
            l1.addBook(book1);
            l1.addBook(book2);
            l1.addBook(book3);
            l1.addBook(book4);
            l1.addBook(book5);
            l1.addBook(book6);
            l1.addBook(book7);
            l1.registerUser(user10);
            l1.registerUser(user1);
             

            l1.displayAvailableBooks();
            l1.borrowBook(book10, user1);
            l1.borrowBook(book1, user1);
            l1.borrowBook(book9, user1);
            l1.borrowBook(book5, user1);
            l1.displayAvailableBooks();
            // l1.borrowBook(book8, user1);
            // l1.displayAvailableBooks();
            System.out.println(user1.getBorrowedBookList());
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    } 
}
