package loc.gov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final String CONFIG_FILENAME = "loc.cfg";                 // The name of the config file
    
    private static final String AUTH_KEY         = "CONFIG.AUTH_KEY";        // API Auth key
    private static final String RESPONSE_FORMAT  = "CONFIG.RESPONSE_FORMAT"; // xml | json

    private static final String STORE_RESPONSE   = "CONFIG.STORE_RESPONSE";  // true | false

    private static final String ROOT_URL         = "CONFIG.ROOT_URL";        // http://api1.test.congress.gov/v3

    private static final String BILL_CHAMBER    = "BILL.CHAMBER";            // hr | s | sjres | hjres
    private static final String BILL_NUMBER     = "BILL.NUMBER";             // 21
    private static final String BILL_URL        = "BILL.URL";                // bill
    private static final String BILL_CONGRESS   = "BILL.CONGRESS";           // 117

    /**
     *
     * getProperty
     *
     * Get A Config Property
     *
     * @param property_name The property name to retrieve from the config file.
     *
     * @return String
     */
    public static String getProperty(String property_name) {
        Properties prop = new Properties();

        try (FileInputStream fis = new FileInputStream(CONFIG_FILENAME)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {
            Utils.outputMessageAndBail("Cannot find the config file " + CONFIG_FILENAME);
        } catch (IOException ex) {
            Utils.outputMessageAndBail("Unable to read the config file " + CONFIG_FILENAME);
        }

        String p = prop.getProperty(property_name);
        if (p == null) {
            Utils.outputMessageAndBail("Unable to find property " + property_name);
        } else if (p.equals("")) {
            Utils.outputMessageAndBail("Check your config file, " + property_name + " was not set");
        }

        return p;
    }
    
    // ************************************
    // Config Section
    // ************************************

    /**
     * getAuthKey
     *
     * Get the auth key to make API calls
     *
     * @return String
     */
    public static String getAuthKey() {
        return getProperty(AUTH_KEY);
    }

    /**
     * getResponseFormat
     *
     * Get the format that responses are returned to us in (xml | json)
     *
     * @return String
     */
    public static String getResponseFormat() {
        return getProperty(RESPONSE_FORMAT);
    }

    /**
     * getStoreResponse
     *
     * Get the store response value from the config file.
     * A value of true will save the response in a txt file named for the route that was called
     *
     * @return String
     */
    public static String getStoreResponse() {
        return getProperty(STORE_RESPONSE);
    }

    // ************************************
    // API
    // ************************************

    /**
     * getRootUrl
     *
     * Get the root url of the api
     *
     * @return String
     */
    public static String getRootUrl() {
        return getProperty(ROOT_URL);
    }

    // ************************************
    // BILL
    // ************************************

    /**
     * getBillChamber
     *
     * Get the chamber name for the bill config
     *
     * @return String
     */
    public static String getBillChamber() {
        return getProperty(BILL_CHAMBER);
    }

    /**
     * GetBillNumber
     *
     * Get the bill number
     *
     * @return String
     */
    public static String getBillNumber() {
        return getProperty(BILL_NUMBER);
    }

    /**
     * GetBillUrl
     *
     * Get the url value that points the api to the bills
     *
     * @return String
     */
    public static String getBillUrl() {
        return getProperty(BILL_URL);
    }

    /**
     * GetBillCongress
     *
     * Get the congress id for the bill config
     *
     * @return String
     */
    public static String getBillCongress() {
        return getProperty(BILL_CONGRESS);
    }
}
