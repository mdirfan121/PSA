public class Solution {
    public int[] solve(int[] A) {
        int[] temp=new int[A.length];
        int k=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                temp[k++]=A[i];
            }
        }
        int firstPositive=k;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                temp[k++]=A[i];
            }
        }
        int j=0;
        k=0;
        int lastNegative=firstPositive;
        while(j<lastNegative && firstPositive<temp.length){
            A[k++]=temp[j++];
            A[k++]=temp[firstPositive++];
        }
        while(j<lastNegative){
            A[k++]=temp[j++];
        }
        while(firstPositive<temp.length){
            A[k++]=temp[firstPositive++];
        }
        return A;
    }
}
