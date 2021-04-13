    /*
    Definition for TreeNode.
    static public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; this.depth = -1;}
    }
    */

    static void solve(TreeNode A){
         Queue<TreeNode> queue=new LinkedList<TreeNode>();
         queue.add(A);
         queue.add(null);
         int level=1;
         while(!queue.isEmpty()){
             TreeNode temp=queue.remove();
             if(queue.isEmpty()){
                 break;
             }
             if(temp!=null){
                temp.depth=level;
             }
             else{
                 level+=1;
                 queue.add(temp);
             }
             if(temp!=null && temp.left!=null) queue.add(temp.left);
             if(temp!=null && temp.right!=null) queue.add(temp.right);
         }
     }

        
