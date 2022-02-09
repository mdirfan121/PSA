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
    public ListNode deleteMiddle(ListNode head) {
        ListNode main;
        if(count(head)==1) return null;
        if(count(head)%2==1){
            main = oddMiddle(head);
        }
        else{
            main = evenMiddle(head);
        }
        main.next = main.next.next;
        return head;
        
    }
    public static ListNode evenMiddle(ListNode temp){
        if(temp==null) return temp;
        ListNode slow = temp;
        ListNode fast = temp;
        while(fast.next != null && fast.next.next != null){
          slow = slow.next;
          fast = fast.next.next;  
        }
        return slow;
    }
    public static ListNode oddMiddle(ListNode temp){
        if(temp==null) return temp;
        ListNode slow = temp;
        ListNode fast = temp;
        while(slow.next!=null && fast.next.next!=null && fast.next.next.next!=null){
          slow = slow.next;
          fast = fast.next.next;  
        }
        return slow;
    }
    public static int count(ListNode n){
        if(n==null) return 0;
        ListNode temp = n;
        int count = 0;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        return count;
    }
}