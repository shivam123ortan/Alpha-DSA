/*
    PROPERTIES
    * no duplicates
    * unordered
    * Null is allowed
    * hashset is implemented by hashmap

    OPERATIONS
    * add(key)
    * contains(key)
    * remove(key)
 */

import java.util.HashSet;

public class HashSetTut {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        set.remove(2);
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(set.contains(3)){
            System.out.println("set contains 3");
        }

        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }    
}
