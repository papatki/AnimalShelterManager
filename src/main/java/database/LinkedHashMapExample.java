package database;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {


    public LinkedHashMapExample() {
    }

    //save hash map from internal storage
    public void saveHashMapToInternalStorage(String saveData, Map<String, String> linkedHashMap)
            throws FileNotFoundException, IOException {
        try {
            File file = new File(saveData);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(linkedHashMap);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //load hash map from internal storage
    public Map<String, String> loadHashMapFromInternalStorage(String savedData)
            throws IOException, ClassNotFoundException {
        Map<String, String> linkedHashMapList = new LinkedHashMap<>();
        try {
            File toRead = new File(savedData);
            FileInputStream inputStream = new FileInputStream(toRead);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            linkedHashMapList = (LinkedHashMap<String, String>) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
            for (Map.Entry<String, String> m : linkedHashMapList.entrySet()) {
                linkedHashMapList.put(m.getKey(), m.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return linkedHashMapList;
    }
}
