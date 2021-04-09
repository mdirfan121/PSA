public class Solution {
    public int solve(int[] A, int B, int C) {
        int[] prime=new int[A.length];
        int flag=0,ans=0,temp=0;
        for(int i=0;i<A.length;i++){
            flag=0;
            for(int j=2;j*j<=A[i];j++){
                if(A[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                prime[i]=0;
            }
            else{
                prime[i]=1;
            }
        }
        int total=(int)Math.pow(2,A.length);
        int flag1=0;
        for(int i=0;i<total;i++){
            temp=0;
            flag1=0;
            for(int j=0;j<32;j++){
                if((i&(1<<j))>0){
                    temp+=A[j];
                    if(prime[j]==1){
                        flag1=1;
                    }
                }
            }
            if(temp>=B && temp<=C && flag1==1){
                ans+=1;
            }
        }
        return ans;
    }
}
