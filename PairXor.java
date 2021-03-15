public class Solution {
    public int solve(int[] A, int B) {
        Set<Integer> set=new HashSet<Integer>();
        int count=0;
        for(int i=0;i<A.length;i++){
            if(set.contains(A[i]^B)){
                count+=1;
            }
            set.add(A[i]);
        }
        return count;
    }
}
