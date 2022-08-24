import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class Creation {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //concatenation
        String firstName = "Shivam";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        // Index
        System.out.println(fullName.charAt(3));

        //Letters
        printLetters(fullName);
    }
    
}