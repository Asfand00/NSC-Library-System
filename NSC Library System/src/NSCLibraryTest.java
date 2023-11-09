/**
 * This class is a test class for NSCLibraryMediaContainer
 * Contains only one main method to run tests
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class NSCLibraryTest {

    /**
     * The main method for this class to run tests
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Create three separate containers for each media type (Book, DVD, Magazine).
        */
        NSCLibraryMediaContainer<Book> bookContainer = new NSCLibraryMediaContainer<>();
        NSCLibraryMediaContainer<DVD> dvdContainer = new NSCLibraryMediaContainer<>();
        NSCLibraryMediaContainer<Magazine> magContainer = new NSCLibraryMediaContainer<>();

        /*
        Create new media items for each type
         */
        Book book1 = new Book("The Giver", "Lois Lowry", "978-3-16-148410-0", true);
        Book book2 = new Book("The Messenger", "Lois Lowry", "678-7-23-174978-0", false);
        Book book3 = new Book("Artemis Fowl", "Eoin Colfer", "134-9-37-897476-0", true);
        DVD dvd1 = new DVD("Scream", 1.51, "horror", true);
        DVD dvd2 = new DVD("Superbad", 1.54, "comedy", false);
        DVD dvd3 = new DVD("Friday the 13th", 1.35, "horror", true);
        Magazine mag1 = new Magazine("Playboy", 2, "October", true);
        Magazine mag2 = new Magazine("Home Cooking", 6, "May", false);
        Magazine mag3 = new Magazine("National Geographic", 4, "June", true);

        /*
        Add the media items to their respective containers
         */
        bookContainer.add(book1);
        bookContainer.add(book2);
        bookContainer.add(book3);
        dvdContainer.add(dvd1);
        dvdContainer.add(dvd2);
        dvdContainer.add(dvd3);
        magContainer.add(mag1);
        magContainer.add(mag2);
        magContainer.add(mag3);

        /*
        print the media items to terminal
         */
        System.out.println();
        System.out.println("Book(s):\n");
        bookContainer.display();
        System.out.println("---------------------------------");
        System.out.println("DVD(s):\n");
        dvdContainer.display();
        System.out.println("---------------------------------");
        System.out.println("Magazine(s):\n");
        magContainer.display();
        System.out.println("---------------------------------");

        // remove one item from each container
        bookContainer.remove(book1);
        dvdContainer.remove(dvd2);
        magContainer.remove(mag1);

        /*
        print book items again after removal
         */
        System.out.println("\nAfter Removal of Items from each Container");
        System.out.println();
        System.out.println("Book(s):\n");
        bookContainer.display();
        System.out.println("---------------------------------");
        System.out.println("DVD(s):\n");
        dvdContainer.display();
        System.out.println("---------------------------------");
        System.out.println("Magazine(s):\n");
        magContainer.display();
        System.out.println("---------------------------------");

        // test method for null values, throws error message
        NSCMediaUtils.printMediaDetails(null);
        System.out.println();

        /* 
        test method to make sure it can take Book, DVD, or Magazine
        */
        System.out.println("Testing NSCMediaUtils for each media item:");
        System.out.println();
        NSCMediaUtils.printMediaDetails(book1);
        NSCMediaUtils.printMediaDetails(dvd1);
        NSCMediaUtils.printMediaDetails(mag1);
    }
}
