/*

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode current = head;
        int length =0;

        while (current != null) {
            length++;
            current = current.next;
        }
        for(int i=0;i<length-1;i++){
            current = head; 
            for(int j=0;j<length-1-i;j++){
            
                if(current.val > current.next.val){
                  int temp = current.val;
current.val = current.next.val;
current.next.val = temp;
                }
                current= current.next;
            }
        }


   return head;
    }
}

*/