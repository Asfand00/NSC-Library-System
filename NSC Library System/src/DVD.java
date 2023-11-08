/**
 * This class is an extension of MediaItem and creates
 * The DVD MediaItem type
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class DVD extends MediaItem {

    /**
     * The duration of the DVD(using double) in format hours:minutes
     * Example: 9.12 means 9 hours and 12 minutes
     */
    private final double duration;

    /**
     * The genre of the DVD
     */
    private final String genre;

    /**
     * Constructor for the DVD class, Initializes new DVD
     * @param title title of DVD
     * @param duration duration of DVD in format (#.##)
     * @param genre genre of the DVD
     * @param NSCCollection part of NSCCollection? true or false
     */
    public DVD(String title, double duration, String genre, boolean NSCCollection) {
        super(title, NSCCollection);
        this.duration = duration;
        this.genre = genre;

    }

    /**
     * get the duration of the DVD
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * get the genre of the DVD
     * @return the genre of the DVD
     */
    public String getGenre() {
        return genre;
    }

    /**
     * prints all the DVD details (Override from MediaItem)
     */
    public void printDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Duration(hrs): " + this.getDuration());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("NSCCollection?: " + (this.isNSCCollection() ? "Yes" : "No") + "\n");
    }
}
