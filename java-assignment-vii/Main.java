import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a BookRepository instance
        BookRepository repository = new BookRepository();

        // Add books to the repository
        repository.addBook(new Book(1, "1984", "George Orwell", Book.BookCategory.SCIENCE, "1949-06-08", 999.99f, 100));
        repository.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee", Book.BookCategory.HISTORY, "1960-07-11", 478f, 50));
        repository.addBook(new Book(3, "Clean Code", "Robert C. Martin", Book.BookCategory.COMPUTERS_TECHNOLOGY, "2008-08-01", 707f, 15));
        repository.addBook(new Book(4, "Mastering the Art of French Cooking", "Julia Child", Book.BookCategory.COOKING, "1961-10-16", 255f, 10));
        repository.addBook(new Book(5, "The Body: A Guide for Occupants", "Bill Bryson", Book.BookCategory.HEALTH_FITNESS, "2019-10-15", 154.90f, 20));

        // Search for a book by title
        try {
            Book book = repository.getBookByTitle("To Kill a Mockingbird");
            System.out.println("Found book (by title): " + book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            Book book = repository.getBookByTitle("The Great Gatsby");
            System.out.println("Found book (by title): " + book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Search for a book by authorName
        try {
            Book book = repository.getBookByAuthor("George Orwell");
            System.out.println("Found book (by authorName): " + book);
        } catch (AuthorNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            Book book = repository.getBookByAuthor("J.K. Rowling");
            System.out.println("Found book (by authorName): " + book);
        } catch (AuthorNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Search for a book by BookId
        try {
            Book book = repository.getBookById(3);
            System.out.println("Found book (by bookId): " + book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            Book book = repository.getBookById(100);
            System.out.println("Found book (by bookId): " + book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Display all books
        try {
            List<Book> allBooks = repository.getAllBook();
            System.out.println("All books in the library:");
            for (Book book : allBooks) {
                System.out.println(book);
            }
        } catch (BookEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
