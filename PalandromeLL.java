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
    ListNode temp=null;
    public boolean isPalindrome(ListNode A) {
        if(A.next==null) return true;
        temp=A;
        ListNode middle=findMid(A);
        ListNode temp1=recursiveFunc(middle);
        if(temp1!=null) return true;
        else return false;
    }
    public ListNode recursiveFunc(ListNode middle){
        if(middle==null) return temp;
        ListNode ans=recursiveFunc(middle.next);
        if(ans==null) return null;
        else if(middle.val!=temp.val){
            return null;
        }
        else{
            temp=temp.next;
            return temp;
        }

    }
    public static ListNode findMid(ListNode A){
        ListNode slow=A;
        ListNode fast=A;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
