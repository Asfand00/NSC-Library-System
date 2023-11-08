import java.util.ArrayList;

/**
 * Using java generics, This class is a generic container class that can
 * hold different media types extended from class MediaItem
 * @param <T> generic type T
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class NSCLibraryMediaContainer<T extends MediaItem> {

    /**
     * The Container for the media items
     */
    private final ArrayList<T> mediaItems;

    /**
     * Constructor for this class, Initializes new Container
     */
    public NSCLibraryMediaContainer() {
        this.mediaItems = new ArrayList<>();
    }

    /**
     * Adds a media item to the list
     * @param mediaItem the media item to be added
     */
    public void add(T mediaItem) {
        mediaItems.add(mediaItem);
    }

    /**
     * Removes a media item from the list
     * @param mediaItem the media item to be removed
     */
    public void remove(T mediaItem) {
        mediaItems.remove(mediaItem);
    }

    /**
     * Displays the container(entire list) to terminal
     * using NSCMediaUtils.printMediaDetails
     */
    public void display() {
        for (T item : mediaItems) {
            NSCMediaUtils.printMediaDetails(item);
        }
    }
}
