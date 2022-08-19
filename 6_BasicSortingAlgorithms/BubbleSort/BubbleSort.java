public class BubbleSort {

     public static int[] bubbleSort(int arr[]){ // O(n)
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    swap++;
                }
            }
            if(swap==0){
                return arr;
            }
        }
        return arr;
     }
    
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 1, 8};
        int [] sorted = bubbleSort(arr);
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
    }    
}
