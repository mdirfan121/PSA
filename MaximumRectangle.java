public class Solution {
    public int solve(int[][] A) {
        int[] temp=new int[A[0].length];
        int ans=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(i==0){
                   temp[j]=A[i][j];    
                }
                else{
                    if(A[i][j]==0){
                        temp[j]=A[i][j];
                    }
                    else{
                        temp[j]+=A[i][j];
                    }
                }
            }
            int[] prevsmaller=previousSmaller(temp);
            int[] nextsmaller=nextSmaller(temp);
            for(int k=0;k<A[0].length;k++){
                ans=Math.max(ans,temp[k]*(nextsmaller[k]-prevsmaller[k]-1));
            }
        }
        return ans;
    }
    public static int[] previousSmaller(int[] A){
       int[] ans=new int[A.length];
       Stack<Integer> stk=new Stack<Integer>();
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
    public static int[] nextSmaller(int[] A){
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
