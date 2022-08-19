
public class LinearSearch {

    public static int linearSearch(int [] numbers, int key){

        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6 , 6, 3, 34, 324, 24};
        int key = 3;
        
        System.out.println(linearSearch(numbers, key));
    }    
}