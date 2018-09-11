package core;

import api.CoreApi;
import items.Animal;

import java.util.Map;
import java.util.Scanner;

public class CoreApiImpl implements CoreApi {
    //    add new animal to database
    public void addNewAnimal(Map<String, String> database, int size) {
        if (database.size() == size) {
            System.out.println("The shelter is overfilled!");
            System.out.println("The addition of a new animal is unmanageable.");
        } else {
            System.out.println("Add new animal...");
            System.out.println("Enter a unique name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Enter a type of animal:");
            String type = scanner.nextLine();

            Animal newAnimal = new Animal(name, type);
            database.put(newAnimal.getName(), newAnimal.getType());
            System.out.println("Animal correctly added to the base.");
        }
    }

    // delete animal from database
    public void deleteAnimal(Map<String, String> database) {
        if (database.size() == 0) {
            System.out.println("Database is empty.");
        } else {
            System.out.println("Enter the name of a animal to delete it. ");
            Scanner scanner = new Scanner(System.in);
            String animalToRemove = scanner.nextLine();

            if (database.containsKey(animalToRemove)) {
                database.remove(animalToRemove);
                System.out.println(animalToRemove + " has been removed.");
            } else {
                System.out.println("Error. Try again.");
            }
        }
    }

    //  exit the programme
    public void exit() {

    }
}
