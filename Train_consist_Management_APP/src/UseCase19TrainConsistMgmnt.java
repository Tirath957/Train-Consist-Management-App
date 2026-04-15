import java.util.*;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        displayHeader();

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        Arrays.sort(bogieIds);

        displayBogies(bogieIds);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = binarySearch(bogieIds, key);

        displayResult(key, found);

        completionMessage();

        scanner.close();
    }

    static void displayHeader() {
        System.out.println("======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("======================================\n");
    }

    static void displayBogies(String[] bogieIds) {
        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        System.out.println();
    }

    static boolean binarySearch(String[] bogieIds, String key) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
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
        System.out.println("UC19 search completed ...");
    }
}