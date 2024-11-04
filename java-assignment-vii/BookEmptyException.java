/*User defined exception*/
public class BookEmptyException extends RuntimeException {
    public BookEmptyException(String message){
        super(message);
    }
}