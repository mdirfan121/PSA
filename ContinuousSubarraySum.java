public class Solution {
    public int[] solve(int[] A, int B) {
        int p1=0,p2=0;
        int sum=A[0],flag=0;
        while(p2<A.length){
            if(sum<B){
                p2+=1;
                if(p2<A.length){
                    sum+=A[p2]; 
                }
            }
            else if(sum>B){
                sum-=A[p1];
                p1+=1;
            }
            else{
                flag=1;
                break;
            }
        }
        int[] arr=new int[p2-p1+1];
        int k=0;
        if(flag==0) return new int[] {-1};
        else{
            for(int i=p1;i<=p2;i++){
                arr[k]=A[i];
                k+=1;
            }
        }
        return arr;
    }
}
