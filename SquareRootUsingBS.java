public class Solution {
    public int sqrt(int A) {
        long ans=0;
        if(A==0){
            ans=0;
        }
        else{
             long low=1,high=A,mid=0;
             while(low<=high){
                mid=(low+high)/2;
                if(mid*mid<=A){
                  ans=mid;
                  low=mid+1;
                }
                else{
                   high=mid-1;
                }
            }
        }
        return (int)(ans);
    }
}
