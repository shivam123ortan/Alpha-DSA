
public class FloydsTriangle {

    static void floyd(int a){
        int counter = 1;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        floyd(5);
    }
    
}