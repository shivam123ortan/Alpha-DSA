import java.util.*;;

public class Intro {
    public static void main(String[] args) {
        // Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Element -- O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9); // O(n)
        System.out.println(list);

        // Get Element -- O(n)
        int ele = list.get(2);
        System.out.println(ele);

        // Remove Element
        list.remove(2);
        System.out.println(list);

        // Set element at index 
        list.set(2, 10);
        System.out.println(list);

        // Contains?
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
