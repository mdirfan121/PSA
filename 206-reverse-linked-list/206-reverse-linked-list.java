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
    public ListNode reverseList(ListNode head) {
        ListNode low = null;
        ListNode high = null;
        ListNode curr = head;
        while(curr!=null){
            high = curr.next;
            curr.next = low;
            low = curr;
            curr = high;
        }
        head = low;
        return head;
    }
}