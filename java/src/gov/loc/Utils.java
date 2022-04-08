package gov.loc;

public class Utils {

    /**
     * outputMessage
     *
     * Display a message on the console
     *
     * @param message The message to output to System.out
     */
    public static void outputMessage(String message) {
        System.out.println(message);
    }

    /**
     * outputMessage
     *
     * overloaded
     *
     * Display a message on the console (with optional newline)
     *
     * @param message    The message to output to System.out
     * @param addNewline adds a newline at the end of the message if true
     */
    public static void outputMessage(String message, boolean addNewline) {
        String newline = "";
        if (addNewline)
            newline = System.lineSeparator();
        outputMessage(message + newline);
    }

    /**
     * outputMessageAndBail
     *
     * Display a message on the console and exit
     *
     * @param message The message to output to System.out
     */
    public static void outputMessageAndBail(String message) {
        outputMessage(message);
        System.exit(1);
    }
}
