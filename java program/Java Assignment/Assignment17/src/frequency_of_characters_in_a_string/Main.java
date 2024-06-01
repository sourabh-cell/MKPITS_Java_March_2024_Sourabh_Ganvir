package frequency_of_characters_in_a_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        FrequencyOfCharecter f=new FrequencyOfCharecter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the String ");
        try {
            //readline method throw exception
            String str= reader.readLine();

        f.setInput_string(str);

        f.charecterFrequency();

        f.displayCharFreq();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
