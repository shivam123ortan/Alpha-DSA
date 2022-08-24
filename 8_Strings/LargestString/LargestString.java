// For a given set of Strings, print the largest string.
// Lexicographical Order (Comparison between Strings)
// .compareTo() and .compareToIgnoreCase()--> Ignores case.

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        // O(x*n) x is length of elements
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
