import java.util.*;

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        displayHeader();

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        displayBogies(bogieIds);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = linearSearch(bogieIds, key);

        displayResult(key, found);

        completionMessage();

        scanner.close();
    }

    static void displayHeader() {
        System.out.println("======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("======================================\n");
    }

    static void displayBogies(String[] bogieIds) {
        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        System.out.println();
    }

    static boolean linearSearch(String[] bogieIds, String key) {
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
        System.out.println("UC18 search completed ...");
    }
}