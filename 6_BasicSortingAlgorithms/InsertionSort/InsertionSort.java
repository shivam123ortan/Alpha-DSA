public class InsertionSort {

    public static void insertionSort(int arr[]){ // O(n2)
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int curr = arr[i];
            int prev = i-1;
            // Finding Position to insert
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 3, 67, 3, 67, 100};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}
