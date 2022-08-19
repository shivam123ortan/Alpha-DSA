public class PrefixSum {

    public static void prefixSum(int [] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int [] prefix = new int[arr.length];

        prefix[0] = arr[0];
        // Calculating Prefix Sum
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = i==0 ? prefix[0] : prefix[j] - prefix[i];
            }
            if (currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("MaxSum: " + maxSum);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        prefixSum(arr);

    }    
}
