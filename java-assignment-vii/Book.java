public class Book {
    private int bookId;
    private String title;
    private String authorName;
    private String publishedDate;
    private float price;
    private int qty;

    //Declaring enum for fixed and constant bookCategory
    public enum BookCategory {
        SCIENCE,
        HISTORY,
        COMPUTERS_TECHNOLOGY,
        COOKING,
        HEALTH_FITNESS
    }
    private final BookCategory category;

    // Parameterized Constructor
    public Book(int bookId, String title, String authorName, BookCategory category, String publishedDate, float price, int qty) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.category = category;
        this.publishedDate = publishedDate;
        this.price = price;
        this.qty = qty;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthorName() {
        return authorName;
    }
    public BookCategory getCategory() {
        return category;
    }
    public String getPublishedDate() {
        return publishedDate;
    }
    public float getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    @Override
    public String toString(){
        return "Book{bookId: "+bookId+", title: "+title+", authorName: "+authorName+", bookCategory: "+category+", publishedDate: "+publishedDate+", price: "+price+", Qty: "+qty+"}";
    }

}