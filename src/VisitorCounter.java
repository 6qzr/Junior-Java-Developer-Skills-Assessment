public class VisitorCounter {
    // Static variable to count total visitors
    private static int totalVisitors = 0;
    // Non-static variable for individual session
    private int sessionVisits;
    private String visitorName;

    // Constructor
    public VisitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisits = 0;
        totalVisitors++; // Increment total when new visitor is created
    }
    // Non-static method
    public void recordVisit() {
        sessionVisits++;
        System.out.println(visitorName + " visited. Session visits: " +
                sessionVisits);
    }
    // Static method
    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }
    // Static method to get total (getter)
    public static int getTotalVisitors() {
        return totalVisitors;
    }
    public static void main(String[] args) {
        // Create 3 different visitors
        VisitorCounter mohammed = new VisitorCounter("Mohammed");
        VisitorCounter omar = new VisitorCounter("Omar");
        VisitorCounter mira = new VisitorCounter("Mira");
        // Have each visitor record some visits
        mohammed.recordVisit();
        mohammed.recordVisit();
        mohammed.recordVisit();
        omar.recordVisit();
        omar.recordVisit();
        mira.recordVisit();
        // Display total visitors using static method
        displayTotalVisitors();
    }
}