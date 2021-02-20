public class Solution {
    public int[] sortColors(int[] A) {
        int p1=0,p2=0;
        while(p2<A.length){
            if(A[p2]==0){
                int temp=A[p2];
                A[p2]=A[p1];
                A[p1]=temp;
                p1+=1;
            }
            p2+=1;
        }
        p2=p1;
        while(p2<A.length){
            if(A[p2]==1){
                int temp=A[p2];
                A[p2]=A[p1];
                A[p1]=temp;
                p1+=1;
            }
                p2+=1;
        }
        return A;
    }
}
