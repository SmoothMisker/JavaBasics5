import java.util.*;
import java.util.stream.Collectors;

public class intToString {

    public static void main(String [] args){
        List<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(6);

        String answer = arr.stream().map(x -> {
            if(x%2 == 0) return "e" + x; else return "o" + x ;
        }).collect(Collectors.joining(","));


        System.out.println(answer);
    }

}

