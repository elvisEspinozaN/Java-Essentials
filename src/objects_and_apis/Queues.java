package objects_and_apis;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("plum");
        fruits.add("grape");

        fruits.add("grape");

        var removed = fruits.remove(); // removes first in line

        // an ordered collection
        // FIFO : first in, first out

        System.out.println(fruits);
        System.out.println("removed : " + removed);
        System.out.println("Head of Queue : "
                + fruits.peek());
    }

}
