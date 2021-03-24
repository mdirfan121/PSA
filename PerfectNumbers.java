public class Solution {
    public String solve(int A) {
       String ans=new String("");
        String temp=new String("");
        String temp1=new String("");
        Queue<String> queue=new LinkedList<String>();
        int count=0;
        while(count!=A){
           temp=temp1;
           queue.add(temp+"1");
           ans=temp+"1";
           count+=1;
           if(count==A){
               break;
           }
           else{
               temp=temp1;
               queue.add(temp+"2");
               ans=temp+"2";
               temp1=queue.poll();
               count+=1;
           }
        }
        StringBuilder str=new StringBuilder(ans);
        ans+=str.reverse().toString();
        return ans;
    }
}
