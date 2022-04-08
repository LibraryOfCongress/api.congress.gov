package sample;

import gov.loc.Utils;

public class Main {

    /**
     * Main
     *
     * The main entry point
     *
     * @param args The command line arguments
     *
     */
    public static void main(String[] args) {

        if (args.length > 0) {
            switch (args[0]) {
                case "help" -> help();
                case "all_bill_calls" -> {
                    Utils.outputMessage("Running all API endpoint calls");
                    Bill.runAllBillMethods();
                }
                case "bills_get_all" -> {
                    Utils.outputMessage("Getting all bills...");
                    Bill.getAllBills();
                }
                case "bills_by_congress" -> {
                    Utils.outputMessage("Getting all bills for this congress...");
                    Bill.getAllBillsForCongress();
                }
                case "bills_by_chamber" -> {
                    Utils.outputMessage("Getting all bills for this congressional chamber...");
                    Bill.getAllBillsForCongressionalChamber();
                }
                case "bill" -> {
                    Utils.outputMessage("Getting the specified bill...");
                    Bill.getABillsDetails();
                }
                case "bill_actions" -> {
                    Utils.outputMessage("Getting the specified bills actions...");
                    Bill.getABillsActions();
                }
                case "bill_amendments" -> {
                    Utils.outputMessage("Getting the specified bills amendments...");
                    Bill.getABillsAmendments();
                }
                case "bill_committees" -> {
                    Utils.outputMessage("Getting the specified bills committees...");
                    Bill.getABillsCommittees();
                }
                case "bill_cosponsors" -> {
                    Utils.outputMessage("Getting the specified bills cosponsors...");
                    Bill.getABillsCosponsors();
                }
                case "bill_related_bills" -> {
                    Utils.outputMessage("Getting the specified bills related bills...");
                    Bill.getABillsRelatedBills();
                }
                case "bill_subjects" -> {
                    Utils.outputMessage("Getting the specified bills subjects...");
                    Bill.getABillsSubjects();
                }
                case "bill_summaries" -> {
                    Utils.outputMessage("Getting the specified bills summaries...");
                    Bill.getABillsSummaries();
                }
                case "bill_texts" -> {
                    Utils.outputMessage("Getting the specified bills texts...");
                    Bill.getABillsTexts();
                }
                case "bill_titles" -> {
                    Utils.outputMessage("Getting the specified bills titles...");
                    Bill.getABillsTitles();
                }
                default -> {
                    Utils.outputMessage("I'm sorry, but I didn't understand your input '" + args[0] + "'");
                    Utils.outputMessage("Please check the spelling of the parameter and try again.");
                    Utils.outputMessage("Run with the 'help' option to list the available options.");
                }
            }
        }
        else
            help();
    }

    /**
     * help
     *
     * The help message display
     */
    private static void help() {
        Utils.outputMessage("");
        Utils.outputMessage("Congress Dot Gov - Sample Java Client", true);
        Utils.outputMessage("Available options:", true);

        Utils.outputMessage("help               - display this help message", true);

        Utils.outputMessage("all_bill_calls     - runs all of the defined API calls for bills", true);

        Utils.outputMessage("bills_get_all      - gets all bills");
        Utils.outputMessage("bills_by_congress  - gets all bills by congress");
        Utils.outputMessage("bills_by_chamber   - gets all bills by congressional chamber");
        Utils.outputMessage("bill               - gets a bill");
        Utils.outputMessage("bill_actions       - gets a bills actions");
        Utils.outputMessage("bill_amendments    - gets a bills amendments");
        Utils.outputMessage("bill_committees    - gets a bills committees");
        Utils.outputMessage("bill_cosponsors    - gets a bills cosponsors");
        Utils.outputMessage("bill_related_bills - gets a bills related bills");
        Utils.outputMessage("bill_subjects      - gets a bills subjects");
        Utils.outputMessage("bill_summaries     - gets a bills summaries");
        Utils.outputMessage("bill_texts         - gets a bills texts");
        Utils.outputMessage("bill_titles        - gets a bills titles");
    }
}