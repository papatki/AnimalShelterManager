import core.CoreApiImpl;
import database.DatabaseImpl;
import database.LinkedHashMapExample;
import ui.ConsoleUiImpl;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DatabaseImpl database = new DatabaseImpl();
        CoreApiImpl coreApi = new CoreApiImpl();
        ConsoleUiImpl consoleUi = new ConsoleUiImpl();
//      set size of the shelter
        int shelterSize = 5;

//      creating database
        LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
        Map<String, String> output = linkedHashMapExample.loadHashMapFromInternalStorage("file.txt");

        boolean isRunning = true;
        while (isRunning) {
            consoleUi.printMessage("~ The Animal Shelter Manager 1.0 ~");
            consoleUi.printMessage("1. Add a new animal.\n2. Remove an animal." +
                    "\n3. Check status of the shelter.\n4. Print a report.\n5. Exit.");

            int choice = Integer.parseInt(consoleUi.getInput());
            if (choice == 1) {
                coreApi.addNewAnimal(output, shelterSize);
                linkedHashMapExample.saveHashMapToInternalStorage("file.txt", output);
            } else if (choice == 2) {
                coreApi.deleteAnimal(output);
                linkedHashMapExample.saveHashMapToInternalStorage("file.txt", output);
            } else if (choice == 3) {
                database.getStatusOfDatabase(output, shelterSize);
            } else if (choice == 4) {
                database.printAReport(output);
            } else if (choice == 5) {
                coreApi.exit();
                isRunning = false;
            }
        }
    }
}
