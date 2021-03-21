public class Solution {
    public int solve(int[] A) {
        int[] arr1=previousGreater(A);
        int[] arr2=nextGreater(A);
        int[] arr3=previousSmaller(A);
        int[] arr4=nextSmaller(A);
        long maxcontribution=0,mincontribution=0;
        for(int i=0;i<A.length;i++){
            maxcontribution+=(1L*A[i])*(arr2[i]-i)*(i-arr1[i]);
            mincontribution+=(1L*A[i])*(arr4[i]-i)*(i-arr3[i]);
        }
        return (int)((maxcontribution-mincontribution+1000000007)%1000000007);
    }
    public int[] previousGreater(int[] A){
        Stack<Integer> stk=new Stack<Integer>();
        int[] ans=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            if(stk.isEmpty() || A[i]<=A[stk.peek()]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && A[i]>A[stk.peek()]){
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
    public int[] nextGreater(int[] A){
        Stack<Integer> stk=new Stack<Integer>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(stk.isEmpty() || A[i]<=A[stk.peek()]){
                stk.push(i);
            }
            else{
                while(!stk.isEmpty() && A[i]>A[stk.peek()]){
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
