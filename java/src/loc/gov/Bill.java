package loc.gov;

public class Bill {

    private static final String CHAMBER  = Config.getBillChamber();
    private static final String NUMBER   = Config.getBillNumber();
    private static final String URL      = Config.getBillUrl();
    private static final String CONGRESS = Config.getBillCongress();

    private static final String ROOT_URL = Config.getRootUrl();

    /**
     * runBillMethods
     * 
     * Runs all the bill endpoints against the API
     *
     */
    public static void runAllBillMethods() {
        getAllBills();
        getAllBillsForCongress();
        getAllBillsForCongressionalChamber();
        getABillsDetails();
        getABillsActions();
        getABillsAmendments();
        getABillsCommittees();
        getABillsCosponsors();
        getABillsRelatedBills();
        getABillsSubjects();
        getABillsSummaries();
        getABillsTexts();
        getABillsTitles();
    }

    /**
     * getAllBills
     *
     * Gets all bills
     *
     */
    public static void getAllBills() {
        String url = String.format("%s/%s", ROOT_URL, URL);
        Utils.makeRequest(url);
    }

    /**
     * getAllBillsForCongress
     *
     * Gets all bills for the specified congress
     */
    public static void getAllBillsForCongress() {
        String url = String.format("%s/%s/%s", ROOT_URL, URL, CONGRESS);
        Utils.makeRequest(url);
    }

    /**
     * getAllBillsForCongressionalChamber
     *
     * Gets all bills for the specified congress and chamber
     *
     */
    public static void getAllBillsForCongressionalChamber() {
        String url = String.format("%s/%s/%s/%s", ROOT_URL, URL, CONGRESS, CHAMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsDetails
     *
     * Gets the detail for the specified bill
     */
    public static void getABillsDetails() {
        String url = String.format("%s/%s/%s/%s/%s", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsActions
     *
     * Gets the actions for the specified bill
     */
    public static void getABillsActions() {
        String url = String.format("%s/%s/%s/%s/%s/actions", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsAmendments
     *
     * Gets the amendments for the specified bill
     */
    public static void getABillsAmendments() {
        String url = String.format("%s/%s/%s/%s/%s/amendments", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsCommittees
     *
     * Gets the committees for the specified bill
     */
    public static void getABillsCommittees() {
        String url = String.format("%s/%s/%s/%s/%s/committees", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsCosponsors
     *
     * Gets the cosponsors for the specified bill
     */
    public static void getABillsCosponsors() {
        String url = String.format("%s/%s/%s/%s/%s/cosponsors", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsRelatedBills
     *
     * Gets the related bills for the specified bill
     */
    public static void getABillsRelatedBills() {
        String url = String.format("%s/%s/%s/%s/%s/relatedbills", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
        Utils.makeRequest(url);
    }

    /**
     * getABillsSubjects
     *
     * Gets the subjects for the specified bill
     */
    public static void getABillsSubjects() {
        String url = String.format("%s/%s/%s/%s/%s/subjects", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
       Utils.makeRequest(url);
    }

    /**
     * getABillsSummaries
     *
     * Gets the summaries for the specified bill
     */
    public static void getABillsSummaries() {
        String url = String.format("%s/%s/%s/%s/%s/summaries", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
       Utils.makeRequest(url);
    }

    /**
     * getABillsTexts
     *
     * Gets the texts for the specified bill
     */
    public static void getABillsTexts() {
        String url = String.format("%s/%s/%s/%s/%s/text", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
       Utils.makeRequest(url);
    }

    /**
     * getABillsTitles
     *
     * Gets the titles for the specified bill
     */
    public static void getABillsTitles() {
        String url = String.format("%s/%s/%s/%s/%s/titles", ROOT_URL, URL, CONGRESS, CHAMBER, NUMBER);
       Utils.makeRequest(url);
    }
}
