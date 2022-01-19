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
    long min = Long.MAX_VALUE;
    long secondMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
       int number = secondNumber(root);
       if(number == min || number == Long.MAX_VALUE) return -1;
       else return (int)secondMin;
    }
    public int secondNumber(TreeNode node){
        if(node == null) return -1;
        if(node.val < min){
            secondMin = min;
            min = node.val;
        }
        else if(node.val < secondMin && secondMin != min && node.val!=min){
            secondMin = node.val;
        }
        secondNumber(node.left);
        secondNumber(node.right);
        return (int)secondMin;
    }
}