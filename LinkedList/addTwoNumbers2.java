// Add Two Numbers II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class addTwoNumbers2{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode l1){
        ListNode prev = null;
        ListNode curr = l1;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode prev1 = reverse(l1);
        ListNode prev2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode curr1 = prev1;
        ListNode curr2 = prev2;
        int carry = 0;
        while(curr1 != null || curr2 != null || carry != 0){
            int sum = carry;
            if(curr1 != null){
                sum = sum + curr1.val;
                curr1 = curr1.next;
            }
            if(curr2 != null){
                sum = sum + curr2.val;
                curr2 = curr2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return reverse(dummy.next);
    }
    public static void main(String[] args){
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(head1, head2);
        ListNode curr = result;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
    }
}