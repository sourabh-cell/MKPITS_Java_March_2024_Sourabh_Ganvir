import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Read a text file line by line using the Files.lines() method and process each line using a stream
public class FileProcessing {
    public static void main(String[] args) {

        //Storing path in String
        String file_path ="C:\\Users\\Lenovo\\intel\\Assignment19_StreamAPI\\src\\sample.txt";

        try {
            //Creating Stream lines which read lines 
            Stream<String> lines=Files.lines(Paths.get(file_path));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
