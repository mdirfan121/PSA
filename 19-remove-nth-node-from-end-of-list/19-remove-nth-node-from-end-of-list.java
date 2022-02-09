/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     int count=countNode(head);
        int k=n;
        ListNode temp=head;
        if(k>=count){
            head=head.next;
        }
        else{
            int x=1;
            while(x!=count-k){
                temp=temp.next;
                x+=1;
            }
            temp.next=temp.next.next;
        }
        return head;
    }
    public static int countNode(ListNode x){
        ListNode temp=x;
        if(temp==null) return 0;
        int count=0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }
}