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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> tempans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(null);
        int flag = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            if(temp!=null){
                tempans.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            else{
                
                if(flag==0){
                    ans.add(tempans);
                    flag=1;
                }
                else{
                    Collections.reverse(tempans);
                    ans.add(tempans);
                    flag=0;
                }
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
                tempans = new ArrayList<Integer>();
            }
        }
        return ans;
    }
}