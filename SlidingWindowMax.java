public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Deque<Integer> deque=new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            if(deque.isEmpty() || A.get(i)<A.get(deque.getLast())){
                deque.addLast(i);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())<A.get(i)){
                    deque.removeLast();
                }
                deque.addLast(i);
            }
        }
        ans.add(A.get(deque.getFirst()));
        int k=B;
        while(k<A.size()){
            if(deque.isEmpty() || A.get(k)<A.get(deque.getLast())){
                deque.addLast(k);
            }
            else{
                while(!deque.isEmpty() && A.get(deque.getLast())<A.get(k)){
                    deque.removeLast();
                }
                deque.addLast(k);
            }
            while(!deque.isEmpty() && deque.getFirst()<((k-B)+1)){
                deque.removeFirst();
            }
            ans.add(A.get(deque.getFirst()));
            k+=1;
        }
        return ans;
    }
}
