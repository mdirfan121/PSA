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
    
    public TreeNode buildTree(int[] preO, int[] inO){
        int n=preO.length-1;
        int m=inO.length-1;
        int inS=0,preS=0;
        return constructTree(preO,inO,inS,m,preS,n); 
    }
    public static TreeNode constructTree(int[] preO,int[] inO,int inS,int inEnd,int preS,int preEnd){
      if(inS>inEnd) return null;
      TreeNode root=new TreeNode(preO[preS]);
      if(inS==inEnd) return root;
      int i=0;
      for(i=inS;i<inEnd;i++){
        if(inO[i]==preO[preS]) break;  
      }
      int r=i-inS+preS;
      root.left=constructTree(preO,inO,inS,i-1,preS+1,r);
      root.right=constructTree(preO,inO,i+1,inEnd,r+1,preEnd);
      
      return root;    
    }
}
