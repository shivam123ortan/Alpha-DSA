import java.util.*;

public class Q3 {

    public static void getSet(int nums[]){
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    List<Integer> ll = new ArrayList<>();
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        Collections.sort(ll);
                        if(!res.contains(ll)){
                            res.add(ll);
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,4};
        getSet(nums);
    }    
}
