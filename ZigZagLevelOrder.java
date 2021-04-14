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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> level=new ArrayList<Integer>();
        if(A==null) return ans;
        int flag=1;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp= queue.remove();
            if(temp!=null){
                level.add(temp.val);
                if(flag==1){
                    if(temp.left!=null){
                        stk.push(temp.left);
                    }
                    if(temp.right!=null){
                        stk.push(temp.right);
                    }
                }
                else{
                    if(temp.right!=null){
                        stk.push(temp.right);
                    }
                    if(temp.left!=null){
                        stk.push(temp.left);
                    }
                }
            }
            else{
                if(level.size()>0) ans.add(level);
                level=new ArrayList<Integer>();
                while(!stk.isEmpty()){
                    queue.add(stk.pop());
                }
                if(flag==1){
                    flag=0;
                }
                else{
                    flag=1;
                }
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
            }
        }
        return ans;
    }
}
