/*
 * Get the ith Bit is 0 or 1.
 * 
 * Given --> 0000 1111
 * & operate with (1<<i)
 * viz. if i=2
 * 0000 1111
 * 0000 0100
 * ---------
 * 0000 0100
 * Therefore 1 remains 1 so ith element is 1.
 */
public class Get {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(15, 3));
    }    
}
