import java.util.*;

public class Question6 {
    public void ListOperation(){
        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        System.out.println(list);

        list.addFirst(10);
        System.out.println("AddFirst: "+list);

        list.addLast(16);
        System.out.println("AddLast: "+list);

        list.removeFirst();
        System.out.println("RemoveFirst: "+list);

        list.removeLast();
        System.out.println("RemoveLast: "+list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list.reversed());
    }

    public void SetOperation(){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(List.of(20,30,40,50,60,70));
        System.out.println(set);

        set.addFirst(10);
        System.out.println("AddFirst: "+ set);

        set.addLast(80);
        System.out.println("AddLast: "+ set);

        set.removeFirst();
        System.out.println("RemoveFirst: "+ set);

        set.removeLast();
        System.out.println("RemoveLast: "+ set);

        System.out.println(set.getFirst());

        System.out.println(set.getLast());

        System.out.println(set.reversed());
    }
    public static void main(String[] args){

        Question6 obj = new Question6();

        System.out.println("List operations:");
        obj.ListOperation();

        System.out.println("Set operations:");
        obj.SetOperation();
    }
}