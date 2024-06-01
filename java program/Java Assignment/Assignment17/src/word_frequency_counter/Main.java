package word_frequency_counter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        WordCounter w=new WordCounter();
        File file = new File("src/word_frequency_counter/xyz.txt");
        w.wordCounter(file);
        w.displayHashtable();
    }
}
