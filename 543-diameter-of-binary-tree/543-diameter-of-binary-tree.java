/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode A) {
       height(A);
       return ans;
    }
    public int height(TreeNode temp){
        if(temp==null) return 0;
        int left = height(temp.left);
        int right = height(temp.right);
        ans = Math.max(ans, left+right);
        return Math.max(left,right)+1;
    }
}