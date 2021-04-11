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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempans=new ArrayList<Integer>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp=queue.peek();
            if(temp!=null){
                tempans.add(temp.val);
                queue.remove();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            else{
                queue.remove();
                ans.add(tempans);
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
                tempans=new ArrayList<Integer>();
            }
        }
        return ans;
    }
}
