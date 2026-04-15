import java.util.*;

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        displayHeader();

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        displayOriginal(bogieNames);

        Arrays.sort(bogieNames);

        displaySorted(bogieNames);

        completionMessage();
    }

    static void displayHeader() {
        System.out.println("======================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("======================================\n");
    }

    static void displayOriginal(String[] bogieNames) {
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println();
    }

    static void displaySorted(String[] bogieNames) {
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println();
    }

    static void completionMessage() {
        System.out.println("UC17 sorting completed ...");
    }
}