public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int ans=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]==0) continue;
            ans=Math.max(ans,A[i]%A[i+1]);
        }
        return ans;
    }
}
