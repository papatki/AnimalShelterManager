package ui;

import api.ConsoleUI;
import java.util.Scanner;

public class ConsoleUiImpl implements ConsoleUI {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[;\\r\\n]+");
        String text = scanner.nextLine();
        return text;
    }
}
