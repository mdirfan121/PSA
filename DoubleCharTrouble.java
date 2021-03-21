public class Solution {
    public String solve(String A) {
        Stack<Character> stk=new Stack<Character>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.length();i++){
            if(stk.isEmpty() || (A.charAt(i)!=stk.peek())){
                stk.push(A.charAt(i));
                sb.append(A.charAt(i));
            }
            else{
                stk.pop();
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
