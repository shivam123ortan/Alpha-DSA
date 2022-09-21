

public class Q2 {

    public static int getIndex(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            int mid = (si+ei)/2;

            if(arr[mid] == target) return mid;

            if(arr[si] <= arr[mid]){
                if(target>=arr[si] && target<arr[mid]){
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else {
                if(target>arr[mid] && target<=arr[ei]){
                    si = mid + 1;
                } else { 
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {80, 90, 100, 110, 30, 40, 50, 60};
        int target = 60;
        System.out.println(getIndex(arr, target));
    }
}
