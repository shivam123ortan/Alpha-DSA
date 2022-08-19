
import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {7, 34, 64, 23, 56433, 2, 3};
        //Increasing
        Arrays.sort(arr,0,6);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Integer arr2[] = {7, 34, 64, 23, 56433, 2, 3};
        //Decreasing
        Arrays.sort(arr2, 0, 6, Collections.reverseOrder()); // Will only work if type is written as "Integer" --> it is a object.
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
