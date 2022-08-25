/*
 * Property
 * 
 * 4 --> 100
 * 3 --> 011 &
 * ----> 000
 * 
 * 16 --> 10000
 * 15 --> 01111 &
 * -----> 00000
 * 
 * if n is power of 2 then
 * n & (n-1) = 0 ------------> IMPORTANT
 */

public class Check {

    public static boolean checkIfPower(int n){
        return (n&(n-1)) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(checkIfPower(16));
    }    
}
