/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int B) {
        int count=countNode(head);
        int k=B;
        ListNode temp=head;
        if(k>=count){
            head=head.next;
        }
        else{
            int x=0;
            while(x!=count-k && temp.next!=null){
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
        while(temp.next!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }
}
