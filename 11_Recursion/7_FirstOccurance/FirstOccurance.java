public class FirstOccurance {
    public static int firstOccurance(int arr [], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }    
    public static void main(String[] args) {
        int arr [] = {12, 5, 65, 34, 678};
        int key = 34;
        System.out.println(firstOccurance(arr, key, 0));
    }
}
