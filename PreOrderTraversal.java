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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        if(A==null) return new ArrayList<Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        stk.push(A);
        while(!stk.isEmpty()){
           TreeNode temp=stk.peek();
           ans.add(temp.val);
           stk.pop();
           if(temp.right!=null){
               stk.add(temp.right);
           }
           if(temp.left!=null){
               stk.add(temp.left);
           }
        }
        return ans;
    }
}
