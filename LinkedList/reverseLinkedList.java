// 3. Reverse a LL
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = reverseList(head);
        displayLL(result);
    }
    public static void displayLL(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
}