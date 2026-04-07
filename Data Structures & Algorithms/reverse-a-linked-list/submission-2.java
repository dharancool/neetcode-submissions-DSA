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
        ListNode curr=head;
        ListNode newNode=null;
        ListNode prevNode=null;
        while(curr!=null){
            newNode=curr.next;
            
            curr.next=prevNode;
            prevNode=curr;
            curr=newNode;
            
        }
        head=prevNode;
        return head;
    }
}
