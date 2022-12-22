package itis.informatics;

public interface IMap {
    void put(String key, String value);


    String getValueByKey(String key);


    String[] getKeysByValue(String value);

    void removeByKey(String key);

    ч
    void removeByValue(String value);

    String[] getAllKeys();
}
