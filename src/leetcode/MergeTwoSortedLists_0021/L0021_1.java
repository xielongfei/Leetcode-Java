package leetcode.MergeTwoSortedLists_0021;

/**
 * @author: xielongfei
 * @date: 2021/01/16 22:03
 * @description: 合并两个有序链表
 * @version: 2.5
 */
public class L0021_1 {

    public static void main(String[] args) {
        //l1 = [1,2,4], l2 = [1,3,4]
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new L0021_1().mergeTwoLists(l1, l2);
        System.out.println(1);
    }

    //时间复杂度 O(m+n), 空间复杂度 O(m+n)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tail = new ListNode(-1), node = tail;
        while (l1 != null || l2 != null) {
            int value = 0;
            if (l1 != null && l2 != null) {
                int v1 = l1.val;
                int v2 = l2.val;
                if (v1 < v2) {
                    value = v1;
                    l1 = l1.next;
                } else {
                    value = v2;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                value = l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                value = l2.val;
                l2 = l2.next;
            }
            ListNode n1 = new ListNode(value);
            node.next = n1;
            node = n1;
        }
        return tail != null ? tail.next : tail;
    }

    public static class ListNode {
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
