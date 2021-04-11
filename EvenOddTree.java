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
    public boolean isEvenOddTree(TreeNode A) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<Integer> ans1=new ArrayList<Integer>();
        ArrayList<Integer> ans2=new ArrayList<Integer>();
        int flag=0;
        queue.add(A);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp=queue.remove();
            if(temp!=null){
                if(flag==0){
                    if(temp.val%2==0){
                       return false; 
                    }
                    else{
                        ans1.add(temp.val);
                    }
                }
                else{
                    if(temp.val%2==1){
                        return false;
                    }
                    else{
                        ans2.add(temp.val);
                    }
                }
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            else{
                if(flag==0){
                      System.out.print(ans1);
                      for(int i=0;i<ans1.size()-1;i++){
                          if(ans1.get(i)>=ans1.get(i+1)){
                             return false;
                           }
                      }
                      ans1=new ArrayList<Integer>();
                      flag=1;
                }
                else{
                      System.out.print(ans2);
                      for(int i=0;i<ans2.size()-1;i++){
                        if(ans2.get(i)<=ans2.get(i+1)){
                            return false;
                         }
                       }
                       ans2=new ArrayList<Integer>();
                       flag=0;
                }
                if(queue.isEmpty()){
                    break;
                }
                queue.add(temp);
            }
        }
        return true;
    }
}
