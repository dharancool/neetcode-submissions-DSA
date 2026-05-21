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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int nthNode=size-n;
        if(nthNode==0){
            return head.next;
        }
        temp=head;

        while(nthNode>1){
           head=head.next;
           nthNode--;
        }
        head.next=head.next.next;
        head=temp;
        return head;

    }
}
