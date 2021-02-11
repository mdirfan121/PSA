public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int low=0,high=(A.length*A[0].length)-1,mid=0,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            int x=mid/A[0].length;
            int y=mid%A[0].length;
            if(A[x][y]==B){
                ans=1;
                break;
            }
            else if(A[x][y]>B){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
