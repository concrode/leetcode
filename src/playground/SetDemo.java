package playground;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by captain on 17/2/21.
 */
public class SetDemo {

//    public static void main(String args[]) {
//        // Creating an empty Set
//        Set<String> set = new HashSet<String>();
//
//        // Use add() method to add elements into the Set
//        set.add("Welcome");
//        set.add("To");
//        set.add("Geeks");
//        set.add("4");
//        set.add("Geeks");
//
//        set.stream().sorted().filter(x -> x.length() > 2).forEach(System.out::print);
//
//        System.out.println();
//
//        // Displaying the Set
//        System.out.println("Set: " + set);
//
//        // Creating an iterator
//        Iterator value = set.iterator();
//
//        // Displaying the values after iterating through the iterator
//        System.out.println("The iterator values are: ");
//        while (value.hasNext()) {
//            System.out.println(value.next());
//        }
//    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}