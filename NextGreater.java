public class Solution {
    public int[] nextGreater(int[] A) {
        Stack<Integer> stk=new Stack<Integer>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(stk.isEmpty() || A[i]<=A[stk.peek()]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && A[i]>A[stk.peek()]){
                    ans[stk.peek()]=A[i];
                    stk.pop();
                }
                stk.push(i);
            }
        }
        while(!stk.isEmpty()){
            ans[stk.peek()]=-1;
            stk.pop();
        }
        return ans;
    }
}
