public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    int temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
            if(i==(B-1)){
                ans=A[i];
                break;
            }
        }
        return ans;
    }
}
