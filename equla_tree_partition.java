/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    Stack<Integer> stk = new Stack<Integer>();
    public int solve(TreeNode A) {
       int maxval = subSum(A);
       stk.pop();
       while(!stk.isEmpty()){
           int val = stk.pop();
           if(val == maxval-val) return 1;
       }
       return 0;
    }
    public int subSum(TreeNode temp){
        if(temp == null) return 0;
        int leftsum = subSum(temp.left);
        int rightsum = subSum(temp.right);
        stk.push(leftsum+rightsum+temp.val);
        return leftsum+rightsum+temp.val;
    }
}
