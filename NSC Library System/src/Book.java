/**
 * This class is an extension of MediaItem and creates
 * The Book MediaItem type
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class Book extends MediaItem {

    /**
     * This author of the book
     */
    private final String author;

    /**
     * the ISBN(number on back of book) of the book
     */
    private final String isbn;

    /**
     * Constructor of the Book class, Initializes a new book
     * @param title title of the book
     * @param author author of the book
     * @param isbn ISBN of book
     * @param NSCCollection part of NSCCollection? true or false
     */
    public Book(String title, String author, String isbn, boolean NSCCollection) {
        super(title, NSCCollection);
        this.author = author;
        this.isbn = isbn;
    }

    /**
     * gets the author of the book
     * @return the author name of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * gets the ISBN of book
     * @return ISBN of book
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * prints all of the Book details (Override from MediaItem)
     */
    public void printDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("NSCCollection?: " + (this.isNSCCollection() ? "Yes" : "No") + "\n");
    }
}
