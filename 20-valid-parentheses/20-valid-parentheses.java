class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(stk.isEmpty()){
                    return false;
                }
                else if(stk.peek() != '('){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
            else if(ch == '}'){
               if(stk.isEmpty()){
                    return false;
                }
                else if(stk.peek() != '{'){
                    return false;
                }
                else{
                    stk.pop();
                } 
            }
            else if(ch == ']'){
                if(stk.isEmpty()){
                    return false;
                }
                else if(stk.peek() != '['){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
            else{
                stk.push(ch);
            }
        }
        if(stk.isEmpty()) return true;
        else return false;
    }
}