public class Pallindrome {

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("\\s", "");
        System.out.println(str);
        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // public static boolean isPallindrome(String str){ //O(n)
    //     int i = 0;
    //     int j = str.length()-1;
    //     while(i<j){
    //         if(str.charAt(i) != str.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }    
}
