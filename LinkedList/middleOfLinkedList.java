// 157. Find Middle of Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class middleOfLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode middleofLinkedlist(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(3);
        head.next = new ListNode(8);
        head.next.next = new ListNode(7);
        ListNode result = middleofLinkedlist(head);
        System.out.println(result.val);
    }
}