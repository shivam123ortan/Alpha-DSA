
public class InvHPNumbers {

    static void inverted(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        inverted(10);
    }
    
}
