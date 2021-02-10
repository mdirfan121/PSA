public class Solution {
    public int solve(int[] A) {
        long ans=merge(A,0,A.length-1,0L);
        return (int)(ans%1000000007);
    }
    public static long merge(int[] A,int low,int high,long ans){
        if(low==high){
            return ans;
        }
        int mid=(low+high)/2;
        ans=merge(A,low,mid,ans);
        ans=merge(A,mid+1,high,ans);
        ans+=countInversion(A,low,high,mid);
        return ans;
        
    }
    public static long countInversion(int[] A,int start,int end,int mid){
        int i,k=0;
        long ans=0;
        int m=mid+1;
        int m2=start;
        int temp[]=new int[end-start+1];
        while(m2<=mid && m<=end){
            if(A[m2]>A[m]){
                ans+=mid-m2+1;
                ans%=1000000007;
                temp[k++]=A[m++];
                //m+=1;
            }
            else{
                temp[k++]=A[m2++];
            }
        }
        while(m2<=mid) temp[k++]=A[m2++];
        while(m<=end) temp[k++]=A[m++];
        
        for(i=0;i<end-start+1;i++) A[i+start]=temp[i];
        return ans;
    }
}
