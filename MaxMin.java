public class Solution {
    public int[] solve(int[] A) {
        Arrays.sort(A);
        long maxsum=0,minsum=0;
        int[] ans=new int[2];
        for(int i=0;i<A.length/2;i++){
            maxsum+=Math.abs(A[i]-A[(A.length/2)+i]);
        }
        for(int i=0;i<A.length-1;i+=2){
            minsum+=Math.abs(A[i]-A[i+1]);
        }
        ans[0]=(int)(maxsum%1000000007);
        ans[1]=(int)(minsum%1000000007);
        return ans;
    }
}
