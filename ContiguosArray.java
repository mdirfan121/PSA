public class Solution {
    public int solve(int[] A) {
        Map<Integer,Integer> temp=new HashMap<Integer,Integer>();
        int ans=0;
        int[] temp1=new int[A.length+1];
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                A[i]=-1;
            }
        }
        temp1[0]=0;
        temp1[1]=A[0];
        for(int i=2;i<=A.length;i++){
            temp1[i]=temp1[i-1]+A[i-1];
        }
        for(int i=0;i<temp1.length;i++){
            if(temp.containsKey(temp1[i])){
                int x=temp.get(temp1[i]);
                ans=Math.max(ans,i-x);
            }
            else{
                temp.put(temp1[i],i);
            }
        }
        return ans;
    }
}
