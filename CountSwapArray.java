public class Solution {
    public int solve(int[] A) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-1;j++){
                if(A[j]>A[j+1]){
                    int temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                    ans+=1;
                }
            }
        }
        return ans;
    }
}
