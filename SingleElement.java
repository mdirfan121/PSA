public class SingleElement{
    public static int solve(int[] A) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans=ans^A[i];
        }
        return ans;
    }
}
