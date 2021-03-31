/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode head=null;
        ListNode temp=null;
        int sum=0,carry=0;
        while(A!=null || B!=null || carry!=0){
            if(A!=null){
                sum+=A.val;
            }
            if(B!=null){
                sum+=B.val;
            }
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newnode=new ListNode(sum);
            if(head==null){
                head=newnode;
                temp=head;
            }
            else{
                temp.next=newnode;
                temp=newnode;
            }
            if(A!=null) A=A.next;
            if(B!=null) B=B.next;
            sum=0;
        }
        return head;
    }
}
