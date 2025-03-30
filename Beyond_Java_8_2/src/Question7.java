import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Amit");
        map.put(2, "Priya");
        map.put(3, "Rahul");

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        map.putFirst(0, "Sunita");
        map.putLast(4, "Vikram");
        System.out.println(map);

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map);

        System.out.println(map.reversed());
    }
}