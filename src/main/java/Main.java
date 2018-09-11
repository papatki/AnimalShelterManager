import core.CoreApiImpl;
import database.DatabaseImpl;
import ui.ConsoleUiImpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DatabaseImpl database = new DatabaseImpl();
        CoreApiImpl coreApi = new CoreApiImpl();
        ConsoleUiImpl consoleUi = new ConsoleUiImpl();
//      set size of the shelter
        int shelterSize = 5;

//      creating database
        Map<String, String> animals = new LinkedHashMap<>();

        boolean isRunning = true;
        while (isRunning) {
            consoleUi.printMessage("~ The Animal Shelter Manager 1.0 ~");
            consoleUi.printMessage("1. Add a new animal.\n2. Remove an animal." +
                    "\n3. Check status of the shelter.\n4. Print a report.\n5. Exit.");

            int choice = Integer.parseInt(consoleUi.getInput());
            if (choice == 1) {
                coreApi.addNewAnimal(animals, shelterSize);
            } else if (choice == 2) {
                coreApi.deleteAnimal(animals);
            } else if (choice == 3) {
                database.getStatusOfDatabase(animals, shelterSize);
            } else if (choice == 4) {
                database.printAReport(animals);
            } else if (choice == 5) {
                coreApi.exit();
                isRunning = false;
            }
        }
    }
}
