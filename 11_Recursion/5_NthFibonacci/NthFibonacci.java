public class NthFibonacci {

    // Height of the tree --> SC--> O(n)
    // TC --> O(2^n)
    public static int nthFib(int n){
        if(n==0 || n==1){
            return n;
        }
        int getNo =  + nthFib(n-1) + nthFib(n-2);
        return getNo;
    }
    
    public static void main(String[] args) {
        System.out.println(nthFib(26));
    }    
}
