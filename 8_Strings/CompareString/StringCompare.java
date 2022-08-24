// Some time normal comparison fails to compare strings "=="
public class StringCompare {
    public static void main(String[] args) {
        //Example
        String s1 = "Tony";
        String s2 = new String("Tony"); //This creates new refrence in the pool

        if (s1 == s2){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Not same");
        }

        if (s1.equals(s2)){ // This checks the value
            System.out.println("Both are same");
        }
        else {
            System.out.println("Not same");
        }
    }    
}
