/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int s=0;
        ListNode temp=A;
        while(temp!=null){
             s=s*10+temp.val;
             s=s*10+temp.next.val;
             temp=temp.next.next;
             arr.add(s);
             s=0;
        }
        Collections.sort(arr);
        ListNode tail=A;
        for(int i=0;i<arr.size();i++){
            int x=arr.get(i);
            tail.val=x/10;
            tail=tail.next;
            tail.val=x%10;
            tail=tail.next;
        }
        return A;
    }
}
