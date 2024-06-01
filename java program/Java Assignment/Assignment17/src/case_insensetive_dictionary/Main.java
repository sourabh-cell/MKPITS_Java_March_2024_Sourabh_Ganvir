package case_insensetive_dictionary;

public class Main {
    public static void main(String[] args) {
        CaseInsensitiveDictionary dictionary = new CaseInsensitiveDictionary();

        // Adding word definitions
        dictionary.addOrUpdateDefinition("apple", "A fruit that grows on trees.");
        dictionary.addOrUpdateDefinition("Banana", "An edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants.");
        dictionary.addOrUpdateDefinition("Orange", "The fruit of an evergreen tree of the genus Citrus.");

        // Displaying all entries
        System.out.println("Dictionary Entries:");
        dictionary.displayAllEntries();

        // Updating a word definition
        dictionary.addOrUpdateDefinition("Apple", "A tech company that makes smartphones.");

        // Deleting a word definition
        dictionary.deleteDefinition("banana");

        // Displaying all entries after update and delete
        System.out.println("\nDictionary Entries after Update and Delete:");
        dictionary.displayAllEntries();

        // Retrieving a word definition
        System.out.println("\nDefinition of 'apple': " + dictionary.getDefinition("apple"));
    }
}
