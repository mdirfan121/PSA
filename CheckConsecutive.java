public class Solution {
    public int solve(int[] A) {
        int min_val=A[0],max_val=A[0];
        long sum=A[0];
        for(int i=1;i<A.length;i++){
            min_val=Math.min(min_val,A[i]);
            sum+=A[i];
        }
        for(int i=1;i<A.length;i++){
            max_val=Math.max(max_val,A[i]);
        }
        min_val=min_val-1;
        long total_max=(1L*max_val*(max_val+1))/2;
        long total_min=(1L*min_val*(min_val+1))/2;
        total_max=total_max-total_min;
        if(total_max==sum) return 1;
        else return 0;
    }
}
