/**
 * This class is an extension of MediaItem and creates
 * The Magazine MediaItem type
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class Magazine extends MediaItem{

    /**
     * The issue number of the Magazine
     */
    private final int issueNumber;

    /**
     * The month of the magazine release
     */
    private final String month;

    /**
     * Constructor for the Magazine class, Initializes new Magazine
     * @param title title of the magazine
     * @param issueNumber issue number of the magazine
     * @param month month release of the magazine
     * @param NSCCollection part of NSCCollection? true or false
     */
    public Magazine(String title, int issueNumber, String month, boolean NSCCollection) {
        super(title, NSCCollection);
        this.issueNumber = issueNumber;
        this.month = month;

    }

    /**
     * get issue number of magazine
     * @return issue number of magazine
     */
    public int getIssueNumber() {
        return issueNumber;
    }

    /**
     * get the month of the magazine
     * @return the month of the magazine
     */
    public String getMonth() {
        return month;
    }

    /**
     * prints all the Magazine details (Override from MediaItem)
     */
    public void printDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Issue #: " + this.getIssueNumber());
        System.out.println("Month: " + this.getMonth());
        System.out.println("NSCCollection?: " + (this.isNSCCollection() ? "Yes" : "No") + "\n");
    }
}
