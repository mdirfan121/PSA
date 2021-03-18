public class Solution {
    public int largestRectangleArea(int[] A) {
        long ans=Integer.MIN_VALUE;
        int[] nextSmallerArray=nextSmaller(A);
        int[] previousSmallerArray=previousSmaller(A);
        for(int i=0;i<A.length;i++){
            ans=Math.max(ans,A[i]*(nextSmallerArray[i]-previousSmallerArray[i]-1));
        }
        return (int)(ans%1000000007);
    }
    public int[] previousSmaller(int[] A){
        Stack<Integer> stk=new Stack<Integer>();
        int[] ans=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            if(stk.isEmpty() || A[i]>=A[stk.peek()]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && A[i]<A[stk.peek()]){
                    ans[stk.peek()]=i;
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
    public int[] nextSmaller(int[] A){
        Stack<Integer> stk=new Stack<Integer>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(stk.isEmpty() || A[i]>=A[stk.peek()]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && A[i]<A[stk.peek()]){
                    ans[stk.peek()]=i;
                    stk.pop();
                }
                stk.push(i);
            }
        }
        while(!stk.isEmpty()){
            ans[stk.peek()]=A.length;
            stk.pop();
        }
        return ans;
    }
}
