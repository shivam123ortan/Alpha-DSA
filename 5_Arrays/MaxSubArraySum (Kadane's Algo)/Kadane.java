// Ignore the -ve value if you get
// +ve + +ve --> +ve
// +ve + -ve(small) --> +ve (O)
// +ve + -ve(big) --> +ve-->0 (X)

public class Kadane {

    public static void kadaneSum(int arr []){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("MaxSum: " + ms);
    }
    public static void main(String[] args) {
        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadaneSum(arr);
    }    
}
