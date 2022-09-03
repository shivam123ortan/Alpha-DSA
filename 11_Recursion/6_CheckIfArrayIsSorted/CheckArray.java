public class CheckArray {

    public static boolean checkIfSorted(int [] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checkIfSorted(arr, i+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2, 0, 3, 4, 5};
        System.out.println(checkIfSorted(arr, 0));
    }    
}
