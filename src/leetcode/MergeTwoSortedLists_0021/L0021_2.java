package leetcode.MergeTwoSortedLists_0021;

import leetcode.MergeTwoSortedLists_0021.L0021_1.ListNode;

/**
 * @author: xielongfei
 * @date: 2021/01/18 11:10
 * @description:
 * @version: 2.5
 */
public class L0021_2 {


    public static void main(String[] args) {
        //l1 = [1,2,4], l2 = [1,3,4]
        L0021_1.ListNode l1 = new L0021_1.ListNode(1, new L0021_1.ListNode(2, new L0021_1.ListNode(4)));
        L0021_1.ListNode l2 = new L0021_1.ListNode(1, new L0021_1.ListNode(3, new L0021_1.ListNode(4)));
        L0021_1.ListNode l3 = new L0021_2().mergeTwoLists(l1, l2);
        System.out.println(1);
    }

    /**
     * 递归调用
     * 第33行，如果l1当前节点小于l2当前节点，就保留l1当前节点，然后用l1的下一个节点和l2做合并，合并后的结果保存到l1的下一个节点
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
