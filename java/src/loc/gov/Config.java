package loc.gov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final String CONFIG_FILENAME = "loc.cfg";
    
    private static final String AUTH_KEY         = "CONFIG.AUTH_KEY";
    private static final String RESPONSE_FORMAT  = "CONFIG.RESPONSE_FORMAT";

    private static final String ROOT_URL         = "CONFIG.ROOT_URL";

    private static final String BILL_HR         = "BILL.HR";
    private static final String BILL_NUM        = "BILL.NUM";
    private static final String BILL_URL        = "BILL.URL";
    private static final String BILL_CONGRESS   = "BILL.CONGRESS";

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
            Utils.printMessageAndBail("Cannot find the config file " + CONFIG_FILENAME);
        } catch (IOException ex) {
            Utils.printMessageAndBail("Unable to read the config file " + CONFIG_FILENAME);
        }

        String p = prop.getProperty(property_name);
        if (p == null) {
            Utils.printMessageAndBail("Unable to find property " + property_name);
        } else if (p.equals("")) {
            Utils.printMessageAndBail("Check your config file, " + property_name + " was not set");
        }

        return p;
    }
    
    // ************************************
    // Config Section
    // ************************************

    /**
     * getAuthKey
     *
     * Get the auth key from the config file
     *
     * @return String
     */
    public static String getAuthKey() {
        return getProperty(AUTH_KEY);
    }

    /**
     * getResponseFormat
     *
     * Get the response format from the config file
     *
     * @return String
     */
    public static String getResponseFormat() {
        return getProperty(RESPONSE_FORMAT);
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
     * getBillHr
     *
     * Get the bill chamber
     *
     * @return String
     */
    public static String getBillHr() {
        return getProperty(BILL_HR);
    }

    /**
     * GetBillNum
     *
     * Get the bill number
     *
     * @return String
     */
    public static String getBillNum() {
        return getProperty(BILL_NUM);
    }

    /**
     * GetBillUrl
     *
     * Get the bill url
     *
     * @return String
     */
    public static String getBillUrl() {
        return getProperty(BILL_URL);
    }

    /**
     * GetBillCongress
     *
     * Get the bill congress
     *
     * @return String
     */
    public static String getBillCongress() {
        return getProperty(BILL_CONGRESS);
    }
}
