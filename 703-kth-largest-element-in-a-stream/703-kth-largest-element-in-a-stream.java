class KthLargest {

    PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
    int size = 0;
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int i=0;i<nums.length;i++){
            if(pr.size() < k){
               pr.add(nums[i]); 
            }
            else{
                if(pr.peek()<nums[i]){
                    pr.poll();
                    pr.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(pr.size() < size){
               pr.add(val); 
            }
            else{
                if(pr.peek()<val){
                    pr.poll();
                    pr.add(val);
                }
            }
        return pr.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */