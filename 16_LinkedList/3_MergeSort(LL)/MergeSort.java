import java.util.*;

import LinkedList.Node;

public class MergeSort {

    public Node mergeSort(Node head){
        // BaseCase
        if(head == null && head.next != null){
            return head;
        }
        
        // Find mid
        Node mid = getMid();

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        
        // merge
        return merge(newLeft, newRight);
    }
    
    public static void main(String[] args) {
        
    }
}
