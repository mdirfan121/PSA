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
    class Node{
        int size;
        boolean isBST;
        int min_val;
        int max_val;
        Node(int size, boolean isBST, int max_val, int min_val){
            this.size = size;
            this.isBST = isBST;
            this.min_val = min_val;
            this.max_val = max_val;
        }
    }
    public int solve(TreeNode A) {
        return checkBST(A).size;
    }

    public Node checkBST(TreeNode A){
        if(A==null) return new Node(0,true,Integer.MIN_VALUE,Integer.MAX_VALUE);
        else{
            Node left = checkBST(A.left);
            Node right = checkBST(A.right);
            if(A.val>left.max_val && A.val<right.min_val && left.isBST && right.isBST){
                return new Node(left.size+right.size+1,true,Math.max(A.val,Math.max(right.max_val,left.max_val)),Math.min(A.val,
                Math.min(left.min_val,right.min_val)));
            }
            return new Node(Math.max(left.size,right.size),false,0,0);
        }
    }
}
