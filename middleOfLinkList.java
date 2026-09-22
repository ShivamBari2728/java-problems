/**
 * middleOfLinkList
 */
public class middleOfLinkList {

    // Definition of Linked List Node
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //My solution.
    public static ListNode middleNode(ListNode head) {

        ListNode head2 = head;
        int total = 0;

        while (head2 != null) {
            total++;
            head2 = head2.next;
        }

        if (total == 1) {
            head2 = head;
            return head2;
        }

        System.out.println("Total nodes = " + total);
        System.out.println("Middle position = " + (total / 2 + 1));

        head2 = head.next;

        for (int i = 1; i < (total / 2); i++) {
            head2 = head2.next;
        }

        return head2;
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode middle1 = middleNode(head1);

        System.out.println("Middle node = " + middle1.val);

    }
}

/*
//Optimal solution

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        if(head==null)
        {
            return null;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
*/