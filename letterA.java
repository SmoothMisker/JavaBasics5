import java.util.*;

public class letterA {
    public static void main(String [] args){
        List<String> list= new ArrayList<>();
        list.add("all");
        list.add("apple");
        list.add("axe");
        list.add("antler");

        List<String> answer = list.stream().filter(x -> x.length() == 3).filter(x -> x.charAt(0) == 'a').toList();

        System.out.println(answer);

    }
}
