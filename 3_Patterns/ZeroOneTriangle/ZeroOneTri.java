
public class ZeroOneTri {
    
    static void zeroOne(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                if(((i+j)&1)==0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOne(10);
    }
}
