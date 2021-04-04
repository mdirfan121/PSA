/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A==null || A.next==null) return 1;
        ListNode temp=A;
        ListNode middle=findMid(A);
        ListNode p2=middle.next;
        ListNode temp1=reverseNode(p2);
        while(temp1!=null){
            if(temp.val!=temp1.val){
                return 0;
            }
            temp1=temp1.next;
            temp=temp.next;
        }
        return 1;
    }
    public ListNode findMid(ListNode A){
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseNode(ListNode rev){
        ListNode prev=null;
        ListNode curr=rev;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
