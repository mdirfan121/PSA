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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<TreeNode> stk=new Stack<TreeNode>();
        TreeNode temp=A;
        while(!stk.isEmpty()|| temp!=null){
            if(temp!=null){
                stk.push(temp);
                temp=temp.left;
            }
            else{
                temp=stk.pop();
                ans.add(temp.val);
                temp=temp.right;
            }
        }
        return ans;
    }
}
