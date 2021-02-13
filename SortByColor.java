public class Solution {
    public int[] sortColors(int[] A) {
        int red=0,white=0,blue=0,k=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                red+=1;
            }
            else if(A[i]==1){
                white+=1;
            }
            else{
                blue+=1;
            }
        }
        while(red>0){
            A[k++]=0;
            red-=1;
        }
        while(white>0){
            A[k++]=1;
            white-=1;
        }
        while(blue>0){
            A[k++]=2;
            blue-=1;
        }
        return A;
    }
}
