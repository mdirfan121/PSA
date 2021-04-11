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
    public int solve(TreeNode A) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        int sum1=0,sum2=0,flag=0;
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(temp!=null){
                if(flag==0){
                    sum1+=temp.val;
                }
                else{
                    sum2+=temp.val;
                }
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            else{
                if(queue.isEmpty()){
                    break;
                }
                if(flag==0){
                    flag=1;
                }
                else{
                    flag=0;
                }
                queue.add(temp);
            }
        }
        return sum1-sum2;
    }
}
