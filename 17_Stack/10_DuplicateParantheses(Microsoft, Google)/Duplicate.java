/*
Given a balanced expression, find if it contains duplicate parenthesis or not. A set of parenthesis are duplicate if the same subexpression is surrounded by multiple parenthesis. 

Examples: 

Below expressions have duplicate parenthesis - 
((a+b)+((c+d)))
The subexpression "c+d" is surrounded by two
pairs of brackets.

(((a+(b)))+(c+d))
The subexpression "a+(b)" is surrounded by two 
pairs of brackets.

(((a+(b))+c+d))
The whole expression is surrounded by two 
pairs of brackets.

((a+(b))+(c+d))
(b) and ((a+(b)) is surrounded by two
pairs of brackets.

Below expressions don't have any duplicate parenthesis -
((a+b)+(c+d)) 
No subsexpression is surrounded by duplicate
brackets.
 */

// Algo - jaha pe directly pair mill jaaye vo dublicate hoti hai
import java.util.*;

public class Duplicate {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            // closing
            if(ch == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
