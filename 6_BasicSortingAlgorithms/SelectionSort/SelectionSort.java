import javax.swing.plaf.synth.SynthStyleFactory;

public class SelectionSort {

    public static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            arr[i] = arr[i] ^ arr[minPos];
            arr[minPos] = arr[i] ^ arr[minPos];
            arr[i] = arr[i] ^ arr[minPos];
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={5, 4, 1, 3, 2};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}
