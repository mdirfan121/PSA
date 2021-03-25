public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=(A[i]-B[i]);
        }
        if(sum<0) return -1;
        int f=0,r=0,ans=0;
        sum=0;
        while(r<A.length){
                if(sum+A[r]>=B[r]){
                  sum+=A[r]-B[r];
                  r+=1;
                }
                else{
                  r+=1;
                  f=r;
                  sum=0;
                }
                if(A[f]>=B[f]){
                    ans=f;
                }
                else{
                    f+=1;
                    r+=1;
                    sum=0;
                }
        }
        return ans;
    }
}
