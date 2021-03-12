public class Solution {
    public int solve(int[] A, int B) {
        int minval=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]<minval){
                minval=A[i];
            }
        }
        int low=1,high=minval,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int temp=0;
            for(int i=0;i<A.length;i++){
                temp+=(A[i]/mid);
            }
            if(temp>=B){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
