import java.util.*;

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        displayHeader();

        String[] bogieIds = {};

        try {
            validateState(bogieIds);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Bogie ID to search: ");
            String key = scanner.nextLine();

            boolean found = search(bogieIds, key);

            displayResult(key, found);

            scanner.close();

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        completionMessage();
    }

    static void displayHeader() {
        System.out.println("======================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("======================================\n");
    }

    static void validateState(String[] bogieIds) {
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }
    }

    static boolean search(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    static void displayResult(String key, boolean found) {
        System.out.println();
        if (found) {
            System.out.println("Bogie ID " + key + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("\nUC20 exception handling completed ...");
    }
}