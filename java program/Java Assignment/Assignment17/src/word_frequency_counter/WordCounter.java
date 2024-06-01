package word_frequency_counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;

public class WordCounter {
    Hashtable<String,Integer> hashtable=new Hashtable<>();


    public void wordCounter(File file) {

        int word = 0, count =0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {
                {
                    String[] str = string.split(" ");
                    for (int i = 0; i < str.length; i++) {
                        if (hashtable.containsKey(str[i]))
                        {
                            hashtable.put(str[i],hashtable.get(str[i])+1);
                        }
                        else
                        {
                            hashtable.put(str[i],1);
                        }

                    }

                    string = bufferedReader.readLine();
                }

            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void displayHashtable()
    {
        for (Map.Entry h:hashtable.entrySet())
        {
            System.out.println(h);
        }
    }
}
