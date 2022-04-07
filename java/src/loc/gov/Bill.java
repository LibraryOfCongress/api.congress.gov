package loc.gov;

public class Bill {

    private static final String HR       = Config.getBillHr();
    private static final String NUM      = Config.getBillNum();
    private static final String URL      = Config.getBillUrl();
    private static final String CONGRESS = Config.getBillCongress();

    private static final String ROOT_URL = Config.getRootUrl();

    /**
     * runBillMethods
     * 
     * Runs all the bill endpoints against the API
     *
     */
    public static void runBillMethods() {

        getBills();
        getBillsCongress();
        getBillsListType();
        getBillDetail();
        getBillActions();
        getBillAmendments();
        getBillCommittees();
        getBillCosponsors();
        getBillRelatedBills();
        getBillSubjects();
        getBillSummaries();
        getBillTexts();
        getBillTitles();
    }

    /**
     * getBill
     *
     * Gets all bills
     *
     */
    public static void getBills() {
        String url = String.format("%s/%s", ROOT_URL, URL);
        Utils.makeRequest(url);
    }

    /**
     * getBillsCongress
     *
     * Gets all bills for the specified congress
     */
    public static void getBillsCongress() {
        String url = String.format("%s/%s/%s", ROOT_URL, URL, CONGRESS);
        Utils.makeRequest(url);
    }

    /**
     * getBillsListType
     *
     * Gets all bills for the specified congress and chamber
     *
     */
    public static void getBillsListType() {
        String url = String.format("%s/%s/%s/%s", ROOT_URL, URL, CONGRESS, HR);
        Utils.makeRequest(url);
    }

    /**
     * getBillDetail
     *
     * Gets the detail for the specified bill
     */
    public static void getBillDetail() {
        String url = String.format("%s/%s/%s/%s/%s", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillActions
     *
     * Gets the actions for the specified bill
     */
    public static void getBillActions() {
        String url = String.format("%s/%s/%s/%s/%s/actions", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillAmendments
     *
     * Gets the amendments for the specified bill
     */
    public static void getBillAmendments() {
        String url = String.format("%s/%s/%s/%s/%s/amendments", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillCommittees
     *
     * Gets the committees for the specified bill
     */
    public static void getBillCommittees() {
        String url = String.format("%s/%s/%s/%s/%s/committees", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillCosponsors
     *
     * Gets the cosponsors for the specified bill
     */
    public static void getBillCosponsors() {
        String url = String.format("%s/%s/%s/%s/%s/cosponsors", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillRelatedBills
     *
     * Gets the related bills for the specified bill
     */
    public static void getBillRelatedBills() {
        String url = String.format("%s/%s/%s/%s/%s/relatedbills", ROOT_URL, URL, CONGRESS, HR, NUM);
        Utils.makeRequest(url);
    }

    /**
     * getBillSubjects
     *
     * Gets the subjects for the specified bill
     */
    public static void getBillSubjects() {
        String url = String.format("%s/%s/%s/%s/%s/subjects", ROOT_URL, URL, CONGRESS, HR, NUM);
       Utils.makeRequest(url);
    }

    /**
     * getBillSummaries
     *
     * Gets the summaries for the specified bill
     */
    public static void getBillSummaries() {
        String url = String.format("%s/%s/%s/%s/%s/summaries", ROOT_URL, URL, CONGRESS, HR, NUM);
       Utils.makeRequest(url);
    }

    /**
     * getBillTexts
     *
     * Gets the texts for the specified bill
     */
    public static void getBillTexts() {
        String url = String.format("%s/%s/%s/%s/%s/text", ROOT_URL, URL, CONGRESS, HR, NUM);
       Utils.makeRequest(url);
    }

    /**
     * getBillTitles
     *
     * Gets the titles for the specified bill
     */
    public static void getBillTitles() {
        String url = String.format("%s/%s/%s/%s/%s/titles", ROOT_URL, URL, CONGRESS, HR, NUM);
       Utils.makeRequest(url);
    }
}
