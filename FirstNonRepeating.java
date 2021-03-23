public class Solution {
    public String solve(String A) {
        int[] freq=new int[26];
        Queue<Character> queue=new LinkedList<Character>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)-97]+=1;
            if(freq[A.charAt(i)-97]==1){
                queue.add(A.charAt(i));
            }
            while(!queue.isEmpty()){
                if(freq[queue.peek()-97]==1){
                    ans.append(queue.peek());
                    break;
                }
                queue.poll();
            }
            if(queue.isEmpty()){
                ans.append("#");
            }
        }
        return ans+"";
    }
}
