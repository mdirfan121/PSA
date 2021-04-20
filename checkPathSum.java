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
    public int hasPathSum(TreeNode A, int B) {
         if(A==null) return 0;
       B-=A.val;
       if(A.left==null && A.right==null) return (B==0)?1:0;
       int flag1 = hasPathSum(A.left,B);
       int flag2 = hasPathSum(A.right,B);
       return  ((flag1|flag2)>0)?1:0;
        
    }
}
