public class Solution {
    public int[] solve(int[] A, int B) {
       int[] ans=new int[(A.length+1)-B];
        Queue<Integer> queue=new LinkedList<Integer>();
        int k=0;
        for(int i=0;i<B;i++){
          if(A[i]<0){
              queue.add(i);
          }      
        }
        if(!queue.isEmpty()){
            ans[k++]=A[queue.peek()];
        }
        else{
            ans[k++]=0;
        }
        int x=B;
        while(x<A.length){
            if(A[x]<0){
                queue.add(x);
            }
            while(!queue.isEmpty() && queue.peek()<(x-B)+1){
                queue.poll();
            }
            if(!queue.isEmpty()){
               ans[k++]=A[queue.peek()]; 
            }
            else{
                ans[k++]=0;
            }
            x+=1;
        }
        return ans;
    }
}
