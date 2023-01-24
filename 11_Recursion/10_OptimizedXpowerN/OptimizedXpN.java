public class OptimizedXpN {

    public static int optimizedPower(int x, int n){ // O(logn)
        if(n == 0){
            return 1;
        }

        int halfPow = optimizedPower(x, n/2);
        int halfPowsSq = halfPow * halfPow;
        
        if((n&1)==1){ // odd
            halfPowsSq = x * halfPowsSq;
        }
        return halfPowsSq;
    }
    
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }    
}
