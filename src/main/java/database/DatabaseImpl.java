package database;

import api.Database;

import java.util.Map;

public class DatabaseImpl implements Database {

    // get info about how many animals are already in the shelter
    public void getStatusOfDatabase(Map<String, String> map, int size) {
        System.out.println("In animal shelter there are " + map.size() + " animals.");
        System.out.println("**************************************************");
        if (map.size() < size && size - map.size() == 2) {
            System.out.println("Warning! The animal shelter is almost overfilled.");
            System.out.println("**************************************************");
        } else if (map.size() < size) {
            System.out.println("It's OK. There is still free space for new animals.");
            System.out.println("**************************************************");

        } else if (map.size() == size) {
            System.out.println("The animal shelter is OVERFILLED.");
            System.out.println("**************************************************");
        }
    }

    //print a report about shelter
    public void printAReport(Map<String, String> map) {
        if (map.size() == 0) {
            System.out.println("The animal shelter is empty.");
        } else {
            for (Map.Entry entry : map.entrySet()) {
                System.out.println("Type: " + entry.getValue() + " -name: " + entry.getKey());
            }
        }
        System.out.println("**************************************************");
    }
}
