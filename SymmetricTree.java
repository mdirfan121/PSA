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
    public boolean isSymmetric(TreeNode A) {
        if(A==null) return true;
        return isSymmetric(A.left,A.right);
    }
    public boolean isSymmetric(TreeNode l, TreeNode r) {
	  if (l == null && r == null) {
		 return true;
	  } 
	  else if (r == null || l == null) {
		 return false;
	  }
 
	  if (l.val != r.val)
		  return false;
 
	   if (!isSymmetric(l.left, r.right))
		   return false;
	   if (!isSymmetric(l.right, r.left))
		   return false;
 
	   return true;
    }
}
