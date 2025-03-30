//Question1)
// Write Java code to define List. Insert 5 floating point numbers in List, and using an iterator, find the sum of the
// numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sum {
    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();

        list.add(1.5f);
        list.add(20.3f);
        list.add(25.7f);
        list.add(12.8f);
        list.add(8.6f);

        Iterator<Float> iter = list.iterator();
        float sum = 0.0f;

        while (iter.hasNext()) {
            sum += iter.next();
        }

        System.out.println("Sum : " + sum);
    }
}

