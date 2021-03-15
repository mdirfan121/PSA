public class Solution {
    public int solve(int[] A) {
        Set<Long> temp=new HashSet<Long>();
        long[] check=new long[A.length];
        check[0]=A[0];
        for(int i=1;i<A.length;i++){
           check[i]=check[i-1]+A[i];   
        }
        for(int i=0;i<check.length;i++){
            if(check[i]==0){
                return 1;
            }
            if(temp.contains(check[i])){
                return 1;
            }
            else{
                temp.add(check[i]);
            }
        }
        return 0;
    }
}
