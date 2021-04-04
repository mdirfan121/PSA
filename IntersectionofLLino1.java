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
         ListNode countA=headA;
         ListNode countB=headB;
         int Acount=count(countA);
         int Bcount=count(countB);
         if(Acount>Bcount){
             int k=Acount-Bcount;
             while(k>0){
                 countA=countA.next;
                 k-=1;
             }
         }
         else{
            int k=Bcount-Acount;
            while(k>0){
                countB=countB.next;
                k-=1;
            }
         }
         while(countA!=null || countB!=null){
             if(countA==countB){
                 return countA;
             }
             countA=countA.next;
             countB=countB.next;
         }
         return null;
         
    }
    public  int count(ListNode a){
        ListNode temp=a;
        int count=0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }
}
