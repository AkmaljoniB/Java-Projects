package LeetCode;

public class Merge_two_sorted_lists {
    public static void main(String[] args) {
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        Merge_two_sorted_lists mergeTwoSortedLists = new Merge_two_sorted_lists();
        System.out.println(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public class ListNode {
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
}
