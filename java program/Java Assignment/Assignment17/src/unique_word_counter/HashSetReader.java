//Implement a program that reads a large text file and counts the number of unique words.
package unique_word_counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public class HashSetReader {

    HashSet<String> set=new HashSet<>();
    public void readAndWriteFile(){
        File file=new File("src/unique_word_counter/abc.txt");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));//creating Bufferedreader object for reading file

        String str;

        str= bufferedReader.readLine();//reading 1st line data of file
        while (str!=null)
        {
            String arr[];
            arr=str.split(" "); //spliting string into array
            for (int i = 0; i < arr.length; i++)
            {
                set.add(arr[i]); //adding all element of array in hashset
            }
            str= bufferedReader.readLine(); //overwriting newline data to strin
        }

        for (String s:set)
        {     //printing set
            System.out.println(s);
        }

            System.out.println("total number of unique word in file is :"+set.size());

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
