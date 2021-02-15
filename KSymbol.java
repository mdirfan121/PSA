public class Solution {
    public int solve(int A, int B) {
        if(A==1) return 0;
        else if(A==2){
            if(B==1) return 0;
            else return 1;
        }
        return (1^(B%2 ^solve(A-1,(B+1)/2)));
    }
}
