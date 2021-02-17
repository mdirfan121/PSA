public class Solution {
    public int solve(int[] A, int B) {
        int start=0,end=A.length-1;
        long count=0;
        for(int i=0;i<A.length;i++){
            if((A[start]*1L*A[end])<(B*1L)){
                count+=(2*((end-start)+1))-1;
                start+=1;
            }
            else{
                end-=1;
            }
        }
        return (int)(count%1000000007);
    }
}
