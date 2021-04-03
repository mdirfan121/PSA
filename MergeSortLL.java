/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
           if(A==null || A.next==null){
               return A; 
           }
            ListNode middle=findMid(A);
            ListNode p2=middle.next;
            middle.next=null;
            ListNode first=sortList(A);
            ListNode second=sortList(p2);
            ListNode ans=mergeList(first,second);
            return ans;
    }
    public  ListNode findMid(ListNode A){
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode A,ListNode B){
       ListNode temp=null;
       ListNode tempans=null;
        ListNode p1=A;
        ListNode p2=B;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                if(tempans==null){
                    temp=p1;
                    tempans=p1;
                    p1=p1.next;
                }
                else{
                    temp.next=p1;
                    temp=temp.next;
                    p1=p1.next;
                }
            }
            else{
                if(tempans==null){
                    temp=p2;
                    tempans=p2;
                    p2=p2.next;
                }
                else{
                    temp.next=p2;
                    temp=temp.next;
                    p2=p2.next;
                }
            }
        }
        if(p1!=null){
            temp.next=p1;
        }
        if(p2!=null){
            temp.next=p2;
        }
        return tempans;
    }
}
