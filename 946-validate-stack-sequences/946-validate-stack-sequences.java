class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<Integer>();
        int count = 0;
        int flag = 0;
        for(int i=0;i<pushed.length;i++){
            if(stk.isEmpty()){
                stk.push(pushed[i]);
            }
            else if(stk.peek()==popped[count]){
                stk.pop();
                count+=1;
                i-=1;
            }
            else{
                stk.push(pushed[i]);
            }
        }
        while(!stk.isEmpty()){
            if(stk.peek()!=popped[count]){
                flag = 1;
                break;
            }
            else{
                stk.pop();
                count+=1;
            }
        }
        if(flag==0) return true;
        else return false;
    }
}