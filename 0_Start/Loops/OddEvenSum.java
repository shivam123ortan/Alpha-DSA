
public class OddEvenSum {

    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        
        for(int i=1; i<=100; i++){
            if((i & 1) == 0){
                even+=i;
            } else {
                odd+=i;
            }
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
    
}
