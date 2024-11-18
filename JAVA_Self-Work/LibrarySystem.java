public class LibrarySystem {

    private static int maxSize=5; //maxiumum array size
    private static String[] availableBooks = new String[maxSize];
    private static String[] issuedBooks = new String[maxSize];
    private static int addBooksCounter=0;
    private static int borrowCounter=0;

    public static void main(String[] args) {
        LibrarySystem ls = new LibrarySystem();

        ls.addBook("Mocking Bird");
        addBooksCounter++;
        ls.addBook("Harry Potter");
        addBooksCounter++;
        ls.addBook("Radio-Astronomy Fundamentals");
        addBooksCounter++;
        ls.addBook("Advanced Mathematics");
        addBooksCounter++;
        ls.addBook("Food and Excersize");
        addBooksCounter++;
        ls.addBook("Theory of Everything"); //6th book should fail in addBook()
        
        ls.borrowBook("Harry Potter");
        borrowCounter++;
        ls.borrowBook("Advanced Mathematics");
        borrowCounter++;
        ls.borrowBook("Harry Potter"); //already borrowed book should fail
        System.out.println();


        for(int i=0;i<availableBooks.length;i++){
            System.out.println(availableBooks[i]);
        }
        
        System.out.println();

        for(int j=0;j<issuedBooks.length;j++){
            System.out.println(issuedBooks[j]);
        }
        
    }

    public boolean addBook(String title){
        if(addBooksCounter==maxSize){
            System.out.println("Array is full. Cannot add book.");
            return false;
        }
        availableBooks[addBooksCounter]=title;
        System.out.println("Book added into available books array sucessfully.");
        return true;
    }

    public boolean borrowBook(String bookName){
        for(int i=0;i<maxSize;i++){
            if(availableBooks[i].equals(bookName)){
                availableBooks[i]="";
                System.out.println("Book removed from available books array successfully.");
                for(int j=0;j<maxSize;j++){
                    if(borrowCounter!=maxSize){
                        issuedBooks[borrowCounter]=bookName;
                        System.out.println("Book added to issued books array successfully.");
                        return true;
                    }
                }
            }
        }
        System.out.println("Book is unavailable at the moment and cannot be issued.");
        return false;
    }
}
