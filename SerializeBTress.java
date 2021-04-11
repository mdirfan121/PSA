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
    public ArrayList<Integer> solve(TreeNode A) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        queue.add(A);
        while(!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(temp!=null){
              ans.add(temp.val);
              queue.add(temp.left);
              queue.add(temp.right);
            }
            else{
                ans.add(-1);
            }
        }
        return ans;
    }
}
