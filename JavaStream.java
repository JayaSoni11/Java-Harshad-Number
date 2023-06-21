import java.util.*;
import java.util.stream.*;

public class JavaStream{
    public static void main(String[] args){
        
        List<String> list = Arrays.asList("s","a");
        List<Integer> intList = list.stream()
                               .map(Integer::valueOf)
                               .collect(Collectors.toList());
        System.out.println(intList);
    }
}