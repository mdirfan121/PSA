public class Solution {
    public int solve(int[] A) {
        long min_sum=0,max_sum=0,ans=0;
        Arrays.sort(A);
        int k1=1;
        for(int i=0;i<A.length;i++){
            long temp=pow(A.length-k1);
            min_sum+=(A[i]*temp);
            min_sum%=1000000007;
            k1+=1;
        }
        int k=1;
        for(int i=A.length-1;i>=0;i--){
            long temp1=pow(A.length-k);
            max_sum+=((A[i]*temp1));
            max_sum%=1000000007;
            k+=1;
        }
        ans=max_sum-min_sum;
        return (int)((ans+1000000007)%1000000007);
    }
    public static long pow(int n){
        if(n==1){
            return 2L;
        }
        if(n==0) return 1L;
        long ans=pow(n/2);
        ans*=ans;
        ans%=1000000007;
             if(n%2==1){
                ans=ans*2;
                ans%=1000000007;
             }
             return (ans%1000000007);
    }
}
