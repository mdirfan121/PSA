public class Solution {
    public int searchInsert(int[] A, int B) {
        int low=0,high=A.length-1,mid=0;
        int position=0;
        while(low<=high){
            mid=(low+high)/2;
            if(A[mid]<B){
                position=Math.max(position,mid);
                position+=1;
                low=mid+1;
            }
            else if(A[mid]==B){
                position=mid;
                break;
            }
            else{
                high=mid-1;
            }
        }
        return position;
    }
    
}
