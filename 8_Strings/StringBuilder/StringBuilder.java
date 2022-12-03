public class StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        
        // Not allowed -->
        // int a = 10;
        // a.toString();

        // Allowed -->
        // Integer a = 10;
        // a.toString();

        // Not Allowed -->
        // char ch = 'a';
        // ch.toString();

        // Allowed -->
        // Character ch = 'a';
        // ch.toString();
        
    }    
}
