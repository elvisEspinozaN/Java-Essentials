package objects_and_apis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Iterators {

    public static void main(String[] args) {

        /*
        iterator() method available in all collections
        Set, List, and Queue
         */

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");

        // an objects used to loop through COLLECTIONS
        var i = fruits.iterator();

        while(i.hasNext()) { // return true if more items to process, false if there is no more
            System.out.println(i.next()); // returns next element in the collection

        }

    }

}
