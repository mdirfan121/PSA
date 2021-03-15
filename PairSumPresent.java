public class Solution {
    public int solve(int[] A) {
        Set<Integer> set=new HashSet<Integer>();
        int count=0;
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp=A[i]+A[j];
                if(set.contains(temp)){
                    count+=1;
                }
            }
        }
        return count;
    }
}
