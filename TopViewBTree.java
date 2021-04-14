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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(A==null) return ans;
        Queue<Pair> queue=new LinkedList<Pair>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        Pair p=new Pair(0,A);
        queue.add(p);
        while(!queue.isEmpty()){
            Pair temp=queue.remove();
            if(!map.containsKey(temp.index)){
                int values=(temp.node.val);
                map.put(temp.index,values);
            }
            if(temp.node.left!=null) queue.add(new Pair(temp.index-1,temp.node.left));
            if(temp.node.right!=null) queue.add(new Pair(temp.index+1,temp.node.right));
        }
        for(Integer l:map.values()){
            ans.add(l);
        }
        return ans;
    }
}
class Pair{
    int index;
    TreeNode node;
    Pair(int index,TreeNode node){
        this.index=index;
        this.node=node;
    }
}
