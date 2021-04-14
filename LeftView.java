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
        ArrayList<Integer> level=new ArrayList<Integer>();
        if(A==null) return level;
        int tempans=-1;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp= queue.remove();
            if(temp!=null){
                if(tempans==-1) tempans=temp.val;
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            else{
                level.add(tempans);
                tempans=-1;
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
            }
        }
        return level;
    }
}
