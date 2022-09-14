// The next greater element of some element x in an array is the first
// greater element that is to the right of x in the same array.

import java.util.*;

public class NextGreater {
    public static void main(String[] args) { // O(n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];


        // Peeche se traverse karenge
        for(int i=arr.length-1; i>=0; i--){

            // while - jb tk chota mill rha stack me tb tk
            // pop krte jao
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}

// next Greater Right
// next Greater left
// next Smallest
// next Smaller left