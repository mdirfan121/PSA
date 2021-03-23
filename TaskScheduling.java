public class Solution {
    public int solve(int[] A, int[] B) {
        Queue<Integer> queue=new LinkedList<Integer>();
        int count=0;
        for(int i=0;i<A.length;i++){
            queue.add(A[i]);
        }
        for(int i=0;i<B.length;i++){
            while(queue.peek()!=B[i]){
                queue.add(queue.poll());
                count+=1;
            }
            count+=1;
            queue.poll();
        }
        return count;
    }
}
