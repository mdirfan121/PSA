public class Solution {
    public int solve(int[] A) {
        int low=0,high=A.length-1,mid=0,ans=0;
        if(A.length==1){
            ans=A[0];
        }
        else{
          while(low<=high){
            mid=(low+high)/2;
            if(mid==0){
                if(A[mid]>=A[mid+1]){
                    ans=A[mid];
                    break;
                }
                else{
                    low=mid+1;
                }
                
            }
            else if(mid==A.length-1){
                if(A[mid]>=A[mid-1]){
                    ans=A[mid];
                    break;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]){
                    ans=A[mid];
                    break;
                }
                else if(A[mid]<A[mid-1]){
                    high=mid-1;
                }
                else if(A[mid]<A[mid+1]){
                    low=mid+1;
                }
            }
          }
        }
        return ans;
    }
}
