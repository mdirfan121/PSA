public class Solution {
    public int solve(int[] A, int B) {
        if(A.length==0 || B==0) return 0;
        Arrays.sort(A);
        int ans=A[B-1]-A[0];
        for(int i=0;i<A.length-B+1;i++){
            ans=Math.min(ans,A[B+i-1]-A[i]);
        }
        return ans;
    }
}
