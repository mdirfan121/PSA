public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int currentsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            currentsum+=A[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0) currentsum=0;
        }
        return maxsum;
    }
}
