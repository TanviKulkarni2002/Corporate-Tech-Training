/*Data Structure used: LinkedList: dynamic size, easy for insertion and deletion */
import java.util.LinkedList;
import java.util.List;
public class BookRepository {

    // Initialize the Linked List
    LinkedList<Book> Library = new LinkedList<>();

    // Adding books into the LinkedList
    public Book addBook(Book book){
        Library.add(book);
        return book;
    }

    // Search book on the basis of title
    public Book getBookByTitle(String title){
        for(Book book: Library){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        throw new BookNotFoundException("BookNotFoundException occured.\nBook of title: "+title+" was not found."); // BookNotFoundException
    }

    // Search book on the basis of authorName
    public Book getBookByAuthor(String authorName){
        for(Book book: Library){
            if(book.getAuthorName().equalsIgnoreCase(authorName)){
                return book;
            }
        }
        throw new AuthorNotFoundException("AuthorNotFoundException occured.\nAuthor: "+ authorName+" was not found."); // AuthorNotFoundException
    }

    // Search book on the basis of bookId
    public Book getBookById(int bookId){
        for(Book book: Library){
            if(book.getBookId()==bookId){
                return book;
            }
        }
        throw new BookNotFoundException("BookNotFoundException occured.\nBookId: "+bookId+" was not found."); // BookNotFoundException
    }

    // Display all books in Library
    public List<Book> getAllBook() {
        if(Library.isEmpty()){
            throw new BookEmptyException("BookEmptyException occured.\nNo books were found in the system."); // BookEmptyException
        }
        return Library;
    }
}
