public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        int p1=0,p2=B.length-1;
        int index1=0,index2=0;
        long curr=Integer.MAX_VALUE;
        while(p1<A.length || p2>=0){
            if(Math.abs((A[p1]+B[p2])-C)<Math.abs(curr-C)){
                curr=A[p1]+B[p2];
                index1=p1;
                index2=p2;
            }
            if(Math.abs((A[p1]+B[p2])-C)==Math.abs(curr-C) && (p1<=index1 && p2<index2)){
                index1=p1;
                index2=p2;
            }
            if(A[p1]+B[p2]>C){
                if(p2>0){
                    p2-=1;
                }
                else break;
            }
            else if(A[p1]+B[p2]<C){
                if(p1<A.length-1){
                    p1+=1;
                }
                else break;
            }
            else{
                index1=p1;
                index2=p2;
                return new int[] {A[index1],B[index2]};
            }
        }
        return new int[] {A[index1],B[index2]};
    }
}
