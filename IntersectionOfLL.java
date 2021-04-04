/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> ans=new HashSet<ListNode>();
        ListNode A=headA;
        ListNode B=headB;
        while(A!=null){
            ans.add(A);
            A=A.next;
        }
        while(B!=null){
            if(ans.contains(B)){
                return B;
            }
            B=B.next;
        }
        return null;
    }
}
