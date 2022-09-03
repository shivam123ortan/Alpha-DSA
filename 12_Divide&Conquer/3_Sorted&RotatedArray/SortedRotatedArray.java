/*
Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.

Note: Find the element in O(logN) time and assume that all the elements are distinct.

Example:  

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}, key = 10   
Output : Found at index 3
*/

public class SortedRotatedArray {

    static int atIndex(int arr[], int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if (key == arr[mid]) return mid;

            //Checking whether left or right part of array
            //is sorted?
            if (arr[low] < arr[mid]){

                //Checking if key lies in left part?
                if (key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                } 
                // or right?
                else{
                    low = mid + 1;
                }
                
            }
            else{
                if (key > arr[mid] && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {80, 90, 100, 110, 30, 40, 50, 60};
        int key = 60;
        System.out.println("Index: " + atIndex(arr, key));
    }
    
}
