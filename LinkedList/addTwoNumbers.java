// 93. Add two numbers in Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class addTwoNumbers{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode addTwoNumbers(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(head1 != null || head2 != null || carry != 0){
            int sum = carry;
            if(head1 != null){
                sum = sum + head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum = sum + head2.val;
                head2 = head2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(4);
        ListNode head2 = new ListNode(4);
        ListNode result = addTwoNumbers(head1, head2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}