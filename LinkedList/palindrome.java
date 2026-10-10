// 198. Check if LL is palindrome or not
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class palindrome{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(prev != null){
            if(prev.val != head.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        boolean result = isPalindrome(head);
        System.out.println(result);
    }
}
