public class Solution {
    public int[] solve(int A, int[][] B, int[] C) {
        int[] arr=new int[A];
        int[] finalans=new int[C.length];
        int ans=0;
        for(int i=0;i<B.length;i++){
            arr[B[i][0]-1]+=1;
            if(B[i][1]!=A){
               arr[B[i][1]]-=1;   
            }
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        Arrays.sort(arr);
        for(int i=0;i<C.length;i++){
            int low=0,high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]>=C[i]){
                    finalans[i]=((arr.length-1)-mid)+1;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return finalans;
    }
}
