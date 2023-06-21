import java.util.*;
import java.util.stream.*;

public class SecondMaxMinUsingStream{
    public static void main(String[] args){
        
        List<String> list = Arrays.asList("80","74","2","93","98","26","39");

        int secondLargestNumber = list
        .stream()
        .mapToInt(n->Integer.parseInt(n))
        .sorted()
        .skip(list.size()-2)
        .findFirst()
        .getAsInt();

        System.out.println("Second maximum no is : " + secondLargestNumber);

        int secondMinimumNumber = list
        .stream()
        .mapToInt(n->Integer.parseInt(n))
        .sorted()
        .skip(1)
        .findFirst()
        .getAsInt();

        System.out.println("Second minimum no is : " + secondMinimumNumber);
    }
}