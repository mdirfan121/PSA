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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> tempans = new ArrayList<Integer>();
        if(root==null) return ans;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            TreeNode temp = que.peek();
            if(temp!=null){
                tempans.add(temp.val);
                que.remove();
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
            }
            else{
                que.remove();
                ans.add(tempans);
                if(que.isEmpty()){
                    break;
                }
                que.add(temp);
                tempans = new ArrayList<Integer>();
            }
        }
        return ans;
    }
}