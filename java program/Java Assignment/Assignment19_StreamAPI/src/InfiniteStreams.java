import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

//Create a stream of random numbers and limit it to generate 10 random numbers.
public class InfiniteStreams {
    public static void main(String[] args) {

        //creating object of Random Inbuilt class
        Random random=new Random();

       //generating Stream usinng random object
        IntStream randStream=random.ints(10);
        randStream.forEach(n-> System.out.print(n+" "));




    }
}
