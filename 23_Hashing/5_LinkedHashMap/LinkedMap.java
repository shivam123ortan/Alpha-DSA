/*
    keys are insertion ordered
    all operations are same as hashmap
    made from doubly linked list in an array as bucket
 */

import java.util.LinkedHashMap;

public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }    
}
