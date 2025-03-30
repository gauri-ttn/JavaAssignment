import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args){
        List<Integer> list = Stream.of(1,2,3,4,5,6,7,8).filter(e->e%2==1).collect(Collectors.toUnmodifiableList());
        //list.add(9);
        System.out.println(list);
    }
}
