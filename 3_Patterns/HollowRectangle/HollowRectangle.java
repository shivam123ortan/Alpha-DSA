
public class HollowRectangle {

    static void hollow(int a, int b){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if (i==0 || j==0 || i==a-1 || j==b-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow(10, 5);
    }
}