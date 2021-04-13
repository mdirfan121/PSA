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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(A==null) return ans;
        Queue<Pair> queue=new LinkedList<Pair>();
        Map<Integer,ArrayList> map=new TreeMap<Integer,ArrayList>();
        Pair p=new Pair(0,A);
        queue.add(p);
        while(!queue.isEmpty()){
            Pair temp=queue.remove();
            if(map.containsKey(temp.index)){
                ArrayList<Integer> arr=map.get(temp.index);
                arr.add(temp.node.val);
            }
            else{
                ArrayList<Integer> arr=new ArrayList<Integer>();
                arr.add(temp.node.val);
                map.put(temp.index,arr);
            }
            if(temp.node.left!=null) queue.add(new Pair(temp.index-1,temp.node.left));
            if(temp.node.right!=null) queue.add(new Pair(temp.index+1,temp.node.right));
        }
        for(ArrayList<Integer> l:map.values()){
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
