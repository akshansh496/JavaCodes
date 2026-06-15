package Leetcode;

public class Delete_Middle_Node_of_LinkedList {

    static class ListNode {

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

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        int mid = length(head) / 2;
        int count = 0;

        ListNode temp = head;
        ListNode prev = new ListNode(-1);
        ListNode ans = prev;

        while (count < mid) {
            prev.next = temp;
            prev = prev.next;
            temp = temp.next;
            count++;
        }

        prev.next = temp.next;

        return ans.next;
    }

    public static int length(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
        public static void printList(ListNode head) {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    public static void main(String[] args) {
        // 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        head = deleteMiddle(head);

        System.out.print("After Deleting Middle: ");
        printList(head);
    }
}

