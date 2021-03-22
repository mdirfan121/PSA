public class Solution {
    public String solve(String A) {
        String postfix="";
        StringBuilder st=new StringBuilder();
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='+'||A.charAt(i)=='-'||A.charAt(i)=='*'||A.charAt(i)=='/'||A.charAt(i)=='^'||A.charAt(i)=='('||A.charAt(i)==')'){
                if(A.charAt(i)=='('){
                   stk.push(A.charAt(i)); 
                }
                else if(A.charAt(i)==')'){
                    while(stk.peek()!='('){
                        st.append(stk.pop());
                    }
                    stk.pop();
                }
                else{
                    while(!stk.isEmpty() && priority(stk.peek())>=priority(A.charAt(i)) && stk.peek()!='('){
                        st.append(stk.pop());
                    }
                    stk.push(A.charAt(i));
                }
            }
            else{
                st.append(A.charAt(i));
            }
        }
        while(!stk.isEmpty()){
            st.append(stk.pop());
        }
        return st.toString();
    }
    public int priority(char val){
        if(val=='+' || val=='-'){
            return 1;
        }
        else if(val=='*' || val=='/'){
            return 2;
        }
        else if(val=='^'){
            return 3;
        }
        return 0;
    }
}
