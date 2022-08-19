public class PairsInArray {

    public static void possiblePairs(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int n = arr.length;
        possiblePairs(arr);
        System.out.println("Total Pairs: " + (n*(n-1))/2);
    }    
}
