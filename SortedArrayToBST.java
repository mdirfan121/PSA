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
    public TreeNode sortedArrayToBST(int[] nums) {
        int p1=0;
        int p2=nums.length-1;
       return  sortedBST(nums,p1,p2);
    }
    public static TreeNode sortedBST(int[] arr,int start, int end){
        if(start > end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedBST(arr,start,mid-1);
        root.right = sortedBST(arr,mid+1,end);
        return root;
    }
}
