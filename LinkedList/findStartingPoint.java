// 220. Find the starting point in LL
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findStartingPoint{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode cyclicPoint(ListNode head){
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();
        while(curr != null){
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next;
        ListNode result = cyclicPoint(head);
        System.out.println(result.val);
    }
}