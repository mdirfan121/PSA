public class SearchinRotatedArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int low=0,high=A.length-1,mid=0,ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(A[mid]==B){
                ans=mid;
                break;
            }
            if(B>=A[0]){
                if(A[mid]<A[0]){
                    high=mid-1;
                }
                else{
                    if(A[mid]<B){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
            else{
                if(A[mid]>=A[0]){
                    low=mid+1;
                }
                else{
                    if(A[mid]>B){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
        }
        return ans;
    }
}
