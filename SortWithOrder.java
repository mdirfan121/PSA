public class Solution {
    public int[] solve(int[] A) {
        int flag=0,k=0,min_val,min_index;
        int[] ans=new int[A.length-1];
        for(int i=0;i<A.length-1;i++){
            min_val=A[i];
            min_index=i;
            for(int j=i+1;j<A.length;j++){
               if(A[j]<min_val){
                   min_val=A[j];
                   min_index=j;
               }
            }
            int temp=A[i];
            A[i]=min_val;
            A[min_index]=temp;
            ans[k]=min_index;
            k+=1;
        }
        return ans;
    }
}
