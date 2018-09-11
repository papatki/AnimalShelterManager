package api;


import java.util.Map;

public interface Database {
    void getStatusOfDatabase(Map<String, String> map, int size);

    void printAReport(Map<String, String> map);
}
