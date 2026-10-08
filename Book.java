// Q5: Book Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Book {

    // Instance variables
    String title;
    String author;
    double price;

    // Class (static) variable
    static String publisher = "ABC Publications";

    // Method to display book details
    void displayDetails() {

        // Local variables
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;
        String bookPublisher = publisher;

        // Display book details
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + bookPublisher);
    }

    public static void main(String[] args) {

        // Creating an object of Book class
        Book book = new Book();

        // Local variables
        String bookTitle = "Java Programming";
        String bookAuthor = "James Gosling";
        double bookPrice = 599.0;

        // Assigning local variables to instance variables
        book.title = bookTitle;
        book.author = bookAuthor;
        book.price = bookPrice;

        // Calling the method
        book.displayDetails();
    }
}
