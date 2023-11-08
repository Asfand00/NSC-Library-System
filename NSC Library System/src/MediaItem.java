/**
 * This is the superclass to provide restrictions of what media types can be used in
 * NSCLibraryMediaContainer
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class MediaItem {

    /**
     * The title of the media type
     */
    private final String title;

    /**
     * Is the media type part of the NSCCollection, true or false
     */
    private final boolean NSCCollection;

    /**
     * The super class constructor, takes in title and NSCCollection boolean value
     * for media type
     * @param title the title of the media type
     * @param NSCCollection part of NSCCollection? true or false
     */
    public MediaItem(String title, boolean NSCCollection) {
        this.title = title;
        this.NSCCollection = NSCCollection;
    }

    /**
     * gets the title of the media type
     * @return the title of media type
     */
    public String getTitle() {
        return title;
    }

    /**
     * gets true or false for media type
     * @return true or false if part of collection or not
     */
    public boolean isNSCCollection() {
        return NSCCollection;
    }

    /**
     * This abstract method is defined here for use in subclasses (Override).
     * prints the media type details
     */
    public void printDetails() {
        // Implement this method in subclasses (Book, DVD, Magazine, etc.)
    }
}
