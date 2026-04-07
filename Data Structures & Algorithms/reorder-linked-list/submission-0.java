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
    public void reorderList(ListNode head) {
        //find the middle element
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode head2=slow.next;
        slow.next=null;
        ListNode curr=head2;
        ListNode prevNode=null;
        ListNode newNode=null;
        while(curr!=null){
            newNode=curr.next;
            curr.next=prevNode;
            prevNode=curr;
            curr=newNode;  
        }
        head2=prevNode;

        //merger two lists
        ListNode first=head;
        ListNode second=head2;
   
        while(second!=null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
        
    }
}
