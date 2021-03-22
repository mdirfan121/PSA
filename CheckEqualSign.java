public class Solution {
    public int solve(String A, String B) {
        Map<Character,Integer> map1=global(A);
        Map<Character,Integer> map2=global(B);
        if(map1.equals(map2)){
            return 1;
        }
        else return 0;
    }
    public Map<Character,Integer> global(String A){
        Map<Character,Integer> globalsign=new HashMap<Character,Integer>();
        Stack<Integer> stk=new Stack<Integer>();
        stk.push(1);
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='+' || A.charAt(i)=='-'){
                continue;
            }
            else if(A.charAt(i)==')'){
                stk.pop();
            }
            else if(A.charAt(i)=='(' && i!=0){
                if(A.charAt(i-1)=='-'){
                    stk.push(stk.peek()*(-1));
                }
                else{
                    stk.push(stk.peek()*(1));
                }
            }
            else if(A.charAt(i)=='(' && i==0){
                stk.push(stk.peek()*(1));
            }
            else{
                if(i!=0 && A.charAt(i-1)=='-'){
                    globalsign.put(A.charAt(i),stk.peek()*-1);
                }
                else{
                    globalsign.put(A.charAt(i),stk.peek());
                }
            }
        }
        return globalsign;
    }
}
