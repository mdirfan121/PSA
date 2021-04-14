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
    public TreeNode invertTree(TreeNode A) {
        TreeNode ans=A;
        if(ans==null) return null;
        
        invertTree(ans.left);
        invertTree(ans.right);
        TreeNode temp=ans.left;
        ans.left=ans.right;
        ans.right=temp;
        return ans;
    }
}
