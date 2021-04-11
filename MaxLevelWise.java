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
    public List<Integer> largestValues(TreeNode A) {
        if(A==null) return new ArrayList<Integer>();
        ArrayList<Integer> tempans=new ArrayList<Integer>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        int maxval=Integer.MIN_VALUE;
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp=queue.peek();
            if(temp!=null){
                maxval=Math.max(maxval,temp.val);
                queue.remove();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            else{
                queue.remove();
                tempans.add(maxval);
                maxval=Integer.MIN_VALUE;
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
            }
        }
        return tempans;
    }
}
