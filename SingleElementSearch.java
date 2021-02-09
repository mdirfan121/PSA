public class Solution {
    public int solve(int[] A) {
        int low=0,high=A.length-1,mid=0,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(mid==0){
                if(A[mid]!=A[mid+1]){
                    ans=A[mid];
                    break;
                }
            }
            else if(mid==A.length-1){
                if(A[mid]!=A[mid-1]){
                    ans=A[mid];
                    break;
                }
            }
            else{
                if(A[mid]!=A[mid-1] && A[mid]!=A[mid+1]){
                    ans=A[mid];
                    break;
                }
            }
            if(mid%2==0){
                if(A[mid]==A[mid+1]){
                    low=mid+1;
                }
                else{
                   high=mid-1; 
                }
            }
            else{
                if(A[mid]==A[mid-1]){
                   low=mid+1; 
                }
                else{
                    high=mid-1;
                }
            }
        }
        return ans;
    }
}
