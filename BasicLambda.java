import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasicLambda {

    interface lambda1{
         List<String> length(String[] s);
    }


    public static void main(String [] args){
        String [] arr = {"Hello", "World!!!", "Hellllloooooo", "Apples", "Banana" };
        Comparator<String> c = (String n1,String n2) -> {return n1.length() - n2.length();};
        Comparator<String> c2 = (String n1,String n2) -> {return n2.length() - n1.length();};



        //sorted by length
        lambda1 s = (n) -> {
            List<String> answer = Arrays.stream(n).sorted(c)
                    .toList();
            return  answer;
        };
        //sorted by length reversed
        lambda1 t = (n) ->{
            List<String> answer = Arrays.stream(n).sorted(c2)
                    .toList();
            return answer;
        };
        //sorted by alphabetical
        lambda1 u = (n) ->{
            List<String> answer = Arrays.stream(n).sorted()
                    .toList();
            return answer;
        };
        //sorted by strings that contain 'e' first
        List<String> list = Arrays.stream(arr)
                .sorted((x,y) -> {if(x.contains("e")) return -1; else return 1;})
                .toList();


        System.out.println(list);


    }
}
