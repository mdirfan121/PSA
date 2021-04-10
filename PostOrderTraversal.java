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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if(A==null) return new ArrayList<Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<TreeNode> stk=new Stack<>();
        stk.push(A);
        TreeNode prev=null;
        while(!stk.isEmpty()){
            TreeNode curr=stk.peek();
            if(prev==null || prev.left==curr || prev.right==curr){
                if(curr.left!=null){
                    stk.push(curr.left);
                }
                else if(curr.right!=null){
                    stk.push(curr.right);
                }
                else{
                    stk.pop();
                    ans.add(curr.val);
                }
            }
            else if(curr.left==prev){
                if(curr.right!=null){
                    stk.push(curr.right);
                }
                else{
                    stk.pop();
                    ans.add(curr.val);
                }
            }
            else{
                stk.pop();
                ans.add(curr.val);
            }
            prev=curr;
        }
        return ans;
    }
}
