// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        // Add Element -- O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        // Ascending
        Collections.sort(list); // For Sorting
        System.out.println(list);

        // Descending
        Collections.sort(list, Collections.reverseOrder()); // Comparator - fnx logic
        System.out.println(list);
    }
}
