/**
 * This class contains one generic static method to work with the
 * NSCLibraryMediaContainer class to display(print) media items
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class NSCMediaUtils {

    /**
     * This method prints the media item by calling its printDetails() method
     * listed in its subclass which is an extension of MediaItem.
     * If mediaItem has no printDetails() method defined in subclass,
     * this method will not do anything.
     * @param mediaItem the media item (Book, DVD, Magazine, etc.)
     * @param <T>       generic type T
     */
    public static <T extends MediaItem> void printMediaDetails(T mediaItem) {
        try {
            mediaItem.printDetails();
        } catch (NullPointerException e) {
            System.out.println("Error: mediaItem Cannot be Null!");
        }
    }
}
