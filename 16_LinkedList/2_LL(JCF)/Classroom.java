// import java.util.*;
import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {

        // CREATE - objects int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        
        // ADD
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        // REMOVE
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }    
}
