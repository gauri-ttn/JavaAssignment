import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.iterate(1, n->n<=10,n->n+2);
        stream.forEach(System.out::println);

    }
}
