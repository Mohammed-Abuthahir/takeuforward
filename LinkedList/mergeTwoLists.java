// 65. Merge two Sorted Lists
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class mergeTwoLists{
    static class ListNode{
        int val; 
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        ListNode curr = dummy;
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                curr.next = curr1;
                curr = curr.next;
                curr1 = curr.next;
            }
            else{
                curr.next = curr2;
                curr = curr.next;
                curr2 = curr2.next;
            }
        }
        if(curr1 != null){
            curr.next = curr1;
        }
        if(curr2 != null){
            curr.next = curr2;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(7);
        head1.next.next.next = new ListNode(9);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(5);
        head2.next.next.next = new ListNode(6);

        ListNode result = mergeTwoLists(head1, head2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}