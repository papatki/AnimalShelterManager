package api;

import java.util.Map;

public interface CoreApi {

    void addNewAnimal(Map<String, String> database, int size);
    void deleteAnimal(Map<String, String> database);
    void exit();

}
