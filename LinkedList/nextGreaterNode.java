// Next Greater Node in the LinkedList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nextGreaterNode{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static int[] nextGreater(ListNode head){
        List<Integer> nums = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            nums.add(curr.val);
            curr = curr.next;
        }
        int[] arr = new int[nums.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.size() - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] = 0;
            }
            else arr[i] = stack.peek();
            stack.push(nums.get(i));
        }
        return arr;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);
        int[] result = nextGreater(head);
        System.out.println(Arrays.toString(result));
    }
}