public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int j=0,k=0,sum=0;
        long curr=Integer.MAX_VALUE;
        for(int i=0;i<A.length-2;i++){
            j=i+1;
            k=A.length-1;
            while(j<k){
               sum=A[i]+A[j]+A[k];
               if(Math.abs(sum-B)<Math.abs(curr-B)){
                   curr=sum;
               }
               if(sum>B){
                   k-=1;
               }
               else if(sum<B){
                   j+=1;
               }
               else{
                   return sum;
               }
            }
        }
        return (int)curr;
    }
}
