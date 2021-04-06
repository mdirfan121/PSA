/*
class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
*/
ListNode flatten(ListNode root) {
    if(root==null || root.right==null) return root;

        ListNode middle=findMid(root);
        ListNode tempmiddle=middle.right;
        middle.right=null;
        ListNode first=flatten(root);
        ListNode second=flatten(tempmiddle);
        ListNode ans=mergeElement(first,second);
        return ans;
    }
    public ListNode findMid(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp;
        while(fast.right!=null && fast.right.right!=null){
            slow=slow.right;
            fast=fast.right.right;
        }
        return slow;
    }
    public ListNode mergeElement(ListNode A,ListNode B){
        ListNode temp1=A;
        ListNode temp2=B;
        ListNode head=null;
        ListNode tail=null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                if(head==null){
                    head=temp1;
                    tail=temp1;
                }
                else{
                    tail.down=temp1;
                    tail=tail.down;
                }
                temp1=temp1.down;
            }
            else{
                if(head==null){
                    head=temp2;
                    tail=temp2;
                }
                else{
                    tail.down=temp2;
                    tail=tail.down;
                }
                temp2=temp2.down;
            }
        }
        if(temp1!=null){
            tail.down=temp1;
        }
        else{
            tail.down=temp2;
        }
        return head;
    }
