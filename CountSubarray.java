public class Solution {
    public int solve(int[] A) {
        Set<Integer> temp=new HashSet<Integer>();
        temp.add(A[0]);
        int p1=0,p2=1;
        long ans=0;
        while(p2<A.length){
            if(!(temp.contains(A[p2]))){
                temp.add(A[p2]);
                p2+=1;
            }
            else{
                ans+=p2-p1;
                temp.remove(A[p1]);
                p1+=1;
            }
        }
        ans+=(1L*(p2-p1)*(1L*(p2-p1)+1))/2;
        return (int)(ans%1000000007);
    }
}
