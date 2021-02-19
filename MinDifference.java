public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int min_value=Math.abs(A[0]-A[1]);
        for(int i=1;i<A.length-1;i++){
            min_value=Math.min(min_value,Math.abs(A[i]-A[i+1]));
        }
        return Math.min(min_value,Math.abs(A[A.length-2]-A[A.length-1]));
    }
}
