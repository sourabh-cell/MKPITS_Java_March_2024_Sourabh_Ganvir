import java.util.ArrayList;
import java.util.List;

//Modify one of the previous assignments to use a parallel stream and compare the performance with the sequential stream
public class ParallelStream {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        //Creating list for large data using loop
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        Long StartSequential=System.currentTimeMillis();
        list.stream().forEach(n-> System.out.print(n));
        Long EndSequential=System.currentTimeMillis();
        System.out.println("\n\nTime taken by Sequential Stream "+(EndSequential-StartSequential));


        Long StartParallel=System.currentTimeMillis();
        list.parallelStream().forEach(n-> System.out.print(n));
        Long EndParallel=System.currentTimeMillis();
        System.out.println("\n\nTime taken by Parallel Stream "+(EndParallel-StartParallel));

    }
}
