public class Solution {
    public int[] solve(int[] A) {
        int[] ans=new int[A.length];
        int fNeg=0,fPos=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                fNeg=i-1;
                break;
            }
        }
        int j=0;
        fPos=fNeg+1;
        while(fPos<A.length && fNeg>=0){
            if(Math.abs(A[fPos])<=Math.abs(A[fNeg])){
                ans[j++]=A[fPos]*A[fPos];
                fPos++;
            }else{
                ans[j++]=A[fNeg]*A[fNeg];
                fNeg--;
            }
        }
        while(fPos<A.length){
            ans[j++]=A[fPos]*A[fPos];
            fPos++;
        }
        while(fNeg>=0){
            ans[j++]=A[fNeg]*A[fNeg];
            fNeg--;
        }
        return ans;
   }
}
