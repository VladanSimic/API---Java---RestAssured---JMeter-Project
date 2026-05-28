package excel;

import java.util.HashMap;
import java.util.Map;

public class DataManager {

    private static final ThreadLocal<DataManager> instance = ThreadLocal.withInitial(DataManager::new);
    private Map<String, String> data = new HashMap<>();

    public static DataManager getInstance() {
        return instance.get();
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setKey(String key, String value) {
        data.put(key, value);
    }

    public String getKey(String key) {
        return data.get(key);
    }

    public void replaceKey(String key, String value) {
        data.replace(key, value);
    }

    public void clearData() {
        data.clear();
    }

}