public class RangeOfElement {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        int low=0,high=A.length-1,mid=0;
        int start=-1,end=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(A[mid]==B){
               start=mid;
               high=mid-1;
            }
            else if(A[mid]<B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=A.length-1;
         while(low<=high){
            mid=(low+high)/2;
            if(A[mid]==B){
               end=mid;
               low=mid+1;
            }
            else if(A[mid]<B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int[] arr=new int[2];
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
}
