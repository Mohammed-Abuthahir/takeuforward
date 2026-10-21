// 86. Partition List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class partition{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode partition(ListNode head, int x){
        ListNode smaller = new ListNode(0);
        ListNode larger = new ListNode(0);
        ListNode curr = head;
        ListNode curr1 = smaller;
        ListNode curr2 = larger;
        while(curr != null){
            if(curr.val < x){
                curr1.next = curr;
                curr1 = curr1.next;
            }
            else{
                curr2.next = curr;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        curr1.next = larger.next;
        curr2.next = null;

        return smaller.next;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        ListNode result = partition(head, x);
        ListNode curr = result;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}