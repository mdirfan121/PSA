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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode temp = root;
        while(!stk.isEmpty() || temp!=null){
            if(temp!=null){
                stk.push(temp);
                temp = temp.left;
            }
            else{
                temp = stk.pop();
                arr.add(temp.val);
                temp = temp.right;
            }
        }
        return arr;
    }
}