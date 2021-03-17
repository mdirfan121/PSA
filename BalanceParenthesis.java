public class Solution {
    public int solve(String A) {
        if(A.length()%2==1) return 0;
        Map<Character,Character> map=new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<A.length();i++){
            if(stk.empty()){
                stk.push(A.charAt(i));
            }
            else if(map.containsKey(A.charAt(i))){
                if(map.get(A.charAt(i))==stk.peek()){
                    stk.pop();
                }
                else{
                    stk.push(A.charAt(i));
                }
            }
            else{
                stk.push(A.charAt(i));
            }
        }
        if(stk.empty()) return 1;
        return 0;
    }
    
}
