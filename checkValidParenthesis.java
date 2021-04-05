class Solution {
    public int minAddToMakeValid(String S) {
        int count=0;
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<S.length();i++){
            char temp=S.charAt(i);
            if(temp=='('){
                stk.push('(');
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    count+=1;
                }
            }
        }
        return count+stk.size();
    }
}
