// Given n friends, each one can remain single or can be 
// paired  only once. Find out the total number of ways in
// which friends can remain single or can be paired up.
// There are n friends.


public class FriendsPairing {

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // //choice
        // //single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totWays
        // int totWays = fnm1 + pairWays;
        // return totWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }    
}
