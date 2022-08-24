public class Pallindrome {

    public static boolean isPallindrome(String str){ //O(n)
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPallindrome(str));
    }    
}
