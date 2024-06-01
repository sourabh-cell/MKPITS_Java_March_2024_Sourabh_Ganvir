package case_insensetive_dictionary;

import java.util.Map;
import java.util.TreeMap;

public class CaseInsensitiveDictionary {
    private TreeMap<String, String> dictionary;

    public CaseInsensitiveDictionary() {
        // TreeMap with a custom case-insensitive comparator
        dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    // Method to add or update a word definition
    public void addOrUpdateDefinition(String word, String definition) {
        dictionary.put(word.toLowerCase(), definition);
    }

    // Method to delete a word definition
    public void deleteDefinition(String word) {
        dictionary.remove(word.toLowerCase());
    }

    // Method to retrieve a word definition
    public String getDefinition(String word) {
        return dictionary.get(word.toLowerCase());
    }

    // Method to display all entries in case-insensitive sorted order
    public void displayAllEntries() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}

