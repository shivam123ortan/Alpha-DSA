/*
    * Keys are sorted
    * put, get, remove are of O(log(n))
    * Made from RedBlack tree (self balancing)
 */

import java.util.*;

public class Tree {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 5);

        System.out.println(tm); // alphabetical order
    }
}
