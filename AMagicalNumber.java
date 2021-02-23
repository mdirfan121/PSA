public class Solution {
    public int solve(int A, int B, int C) {
        long low=Math.min(B,C);
        long high=(Math.max(B,C)*1L*A);
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            long b=mid/B;
            long c=mid/C;
            long x=(B*C)/gcd(B,C);
            x=mid/x;
            if(((b+c)-x)==A){
                ans=mid;
                high=mid-1;
            }
            else if(((b+c)-x)>=A){
                high=mid-1;
            }
            else if(((b+c)-x)<=A){
                low=mid+1;
            }
        }
        return (int)(ans%1000000007);
    }
    public static int gcd(int B,int C){
        if(B==0) return C;
        return gcd(C%B,B);
    }
}
