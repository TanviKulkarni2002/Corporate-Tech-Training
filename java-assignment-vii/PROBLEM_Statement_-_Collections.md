Problem Statement: 

 The Museum Library is a public library based out of bangalore.every day the Library recieves hundreds of books
 which needs to be managed and tracked by the Librarian.As the system to manage the books is maintained manually 
 it is becoming difficult for the Librarian to keep Track of Books.
 Develop an Application that helps the Librarian to manage and track Books


**Define Book,BookRepository and BookClient class as given below**

**Book Class**

Note :- - indicates private and + indicates public

Step 1:
Declare the following private properties 
    bookId : int
    title : String
    authorName : String
    bookCategory : BookCategory
    publishedDate : String
    price : float
    Qty : int

Step 2:
- Define parameterized constructor to initialize the above properties.
- BookCategory should be a constant having the values ( Science, History, Computers & Technology,Cooking, Health & Fitness )
- Provide getter for all the properties
- Override the toString() method to return Book details


**BookRepository class has the following five methods**

Note :- Use appropriate Collection to Store and manipulate Book 

      addBook(Book book) : Book 
       - the addBook method should enable the Librarian to addBook a Book to the collection and return the Book object

      getBookByTitle(String title) : Book
       - the getBookByTitle method should enable the Librarian to pass the title of the book as an argument. if the    title of the book is found in the Collection . then the method should return the Book object. or else it should throw BookNotFoundException

      getBookByAuthor(String authorName) : List<Book>
        - the getBookByAuthor method should enable the Librarian to pass the authorName of the book as an argument. if the books written by the Author  is found in the Collection . then the method should return all the Book written by the author in the form of List. or else it should throw AuthorNotFoundException

      getBookById(int bookId) : Book
       - the getBookById method should enable the Librarian to pass the bookId as an argument. if the book is found  in the Collection . then the method should return the Book object. or else it should throw BookNotFoundException

      getAllBook() : List<Book>
      - the getAllBook method should enable the Librarian to view all the Books available in the Collection.
        if the books are not Avaliable in the Collection it should throw an Exception BookEmptyException



**BookClient class should Implement the following and handle the Exception Accordingly**

    - Librarian should create atleast 3-4 Objects of the Book class
    - Librarian should be able to add the Books using the addBook() method of the BookRepository Class
    - Librarian should be able to search the Book(s) using the getBookByTitle() method of the BookRepository Class
    - Librarian should be able to search the Book(s) using the getBookByAuthor() method of the BookRepository Class
    - Librarian should be able to search the Book(s) using the getBookById() method of the BookRepository Class
    - Librarian should be able to search the Book(s) using the getAllBook() method of the BookRepository Class
    
 
- Follow the comments to complete the Logics for all five methods

## Instructions
- Avoid printing unnecessary values other than expected output
- Take care of whitespace/trailing whitespace (Format your code)
- Do not change the provided class/method names
- Follow best practices while coding

