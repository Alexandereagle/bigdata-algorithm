package day001;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode();
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode tempNode = solution.reverseList(node1);
        while (tempNode != null) {
            System.out.println(tempNode.val);
            tempNode = tempNode.next;
        }
    }
}
