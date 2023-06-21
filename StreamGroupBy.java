import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamGroupBy{
    public static void main(String args[]){

        List<String> g = Arrays.asList("Himanshu", "Himanshu", "Himanshu");

        Map<String, Long> list = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(list);
    }
}