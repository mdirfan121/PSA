public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        int p1=0,p2=0,p3=0,min=0,max=0,ans=Integer.MAX_VALUE;
        while(p1<A.length && p2<B.length && p3<C.length){
            if(A[p1]>=B[p2] && A[p1]>=C[p3]){
                 max=A[p1];
            }
            else if(B[p2]>=C[p3]){
                 max=B[p2];
            }
            else{
                max=C[p3];
            }
            if(A[p1]<=B[p2] && A[p1]<=C[p3]){
                 min=A[p1];
                 p1+=1;
            }
            else if(B[p2]<=C[p3]){
                 min=B[p2];
                 p2+=1;
            }
            else{
                min=C[p3];
                p3+=1;
            }
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
