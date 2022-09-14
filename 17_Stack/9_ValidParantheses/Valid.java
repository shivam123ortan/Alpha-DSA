/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

/*
Algo:
1. Opening bracket - s.push()
2. Closing bracket - s.top() == pair then pop()
                     else return false
3. if empty return true                     
 */

import java.util.*;

public class Valid {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            // closing
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')) {
                        s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(isValid(str));
    }
}
