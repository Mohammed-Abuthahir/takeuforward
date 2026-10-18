// remove duplicate from linkedlist
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class removeDuplicatesLinkedList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode remove(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args){
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(3);
       head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(5);
       ListNode result = remove(head);
       display(result);
    }
    public static void display(ListNode root){
        if(root == null) return;
        while(root != null){
            System.out.println(root.val);
            root = root.next;
        }
    }
}