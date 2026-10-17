// 854. Count Nodes in Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countNodes{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static int countNodes(ListNode head){
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        int result = countNodes(head);
        System.out.println(result);
    }
}