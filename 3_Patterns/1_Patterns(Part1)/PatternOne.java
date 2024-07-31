
public class PatternOne {
    public static void main(String[] args) {
        int n = 5;

        // Star Pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Inverted Star Pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Half Pyramid
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Character Pattern
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}