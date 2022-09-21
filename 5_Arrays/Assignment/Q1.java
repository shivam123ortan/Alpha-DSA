import java.util.Arrays;


public class Q1 {

    public static boolean check(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(check(nums));
    }
}
