public class Solution {
    public int solve(int[] A, int B) {
        for(int i=1;i<A.length;i++){
            A[i]=A[i]+A[i-1];
        }
        //possible subarray of even length having sum<B
        int low=0,high=A.length-1,p=0,j=-1;
        long ans=0;
        for(int i=0;i<A.length;i++){
            low=i;
            high=A.length-1;
            j=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if((A[mid]-p)<B){
                    j=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            p=A[i];
            if(j==-1){
                continue;
            }
            ans+=(((j-i)+1)/2);
        }
        //possible subarray of odd length having sum>B
        low=0;
        high=A.length-1;
        j=-1;
        p=0;
        for(int i=0;i<A.length;i++){
            low=i;
            high=A.length-1;
            j=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if((A[mid]-p)>B){
                    j=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            p=A[i];
            if(j==-1) continue;
            ans+=((A.length-i+1)/2)-((j-i+1)/2);
        }
        if(ans>1000000000) return 1000000000;
        else return (int)(ans);
    }
}
