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
    public TreeNode buildTree(int[] inO, int[] preO) {
        return constructTree(inO,preO,0,inO.length-1,0,preO.length-1);
    }
    public static TreeNode constructTree(int[] inO,int[] preO,int inS,int inEnd,int preS,int preEnd){
      if(inS>inEnd) return null;
      TreeNode root=new TreeNode(preO[preEnd]);
      if(inS==inEnd) return root;
      int i=0;
      for(i=inS;i<inEnd;i++){
        if(inO[i]==preO[preEnd]) break;  
      }
      int r=preS-inS+i-1;
      root.left=constructTree(inO,preO,inS,i-1,preS,r);
      root.right=constructTree(inO,preO,i+1,inEnd,r+1,preEnd-1);
      
      return root;    
    }
}
