class Solution {
    PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
    public int findKthLargest(int[] nums, int k) {
       for(int i=0;i<nums.length;i++){
           if(pr.size()<k){
               pr.add(nums[i]);
           }
           else{
               if(pr.peek()<nums[i]){
                   pr.poll();
                   pr.add(nums[i]);
               }
           }
       }
       return pr.peek();
    }
}