
public class Largest {

    public static int largest(int [] arr){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6 , 6, 3, 34, 324, 24};

        System.out.println(largest(numbers));
    }    
}
