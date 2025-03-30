import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        System.out.println("List "+list);

        Set<Integer> set = Set.of(1,2,3,4,5,6,7,8);
        System.out.println("Set "+set);

        Map<Integer, String> map = Map.of(1,"A", 2,"B", 3,"C");
        System.out.println("Map "+map);
    }
}
