/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        if(A==null || A.next==null) return A;
        ListNode head=null;
        ListNode temp=head;
        ListNode middle=midNode(A);
        while(middle!=null){
            ListNode newnode=new ListNode(middle.val);
            if(head==null){
                head=newnode;
                temp=newnode;
            }
            else{
                newnode.next=temp;
                temp=newnode;
            }
            middle=middle.next;
        }
        int count=countNode(A);
        ListNode first=A;
        ListNode second=temp;
        ListNode ans=null;
        ListNode tempans=null;
        while(first!=null && second!=null){
            ListNode newnode=new ListNode(first.val);
            if(ans==null){
                ans=newnode;
                tempans=newnode;
            }
            else{
                tempans.next=newnode;
                tempans=tempans.next;
            }
            if(count%2==1){
                if(second.next!=null){
                    ListNode newnode1=new ListNode(second.val);
                    tempans.next=newnode1;
                    tempans=tempans.next;
                }
            }
            else{
                ListNode newnode1=new ListNode(second.val);
                tempans.next=newnode1;
                tempans=tempans.next;
            }
            first=first.next;
            second=second.next;
        }
        return ans;
        
    }
    public static ListNode midNode(ListNode A){
        ListNode temp1=A;
        ListNode temp2=A;
        while(temp1.next!=null){
            if(temp1.next.next!=null){
                temp1=temp1.next.next;
            }
            else{
                temp1=temp1.next;
            }
            temp2=temp2.next;
        }
        return temp2;
    }
    public static int countNode(ListNode A){
        int count=0;
        while(A!=null){
            count+=1;
            A=A.next;
        }
        return count;
    }
}
