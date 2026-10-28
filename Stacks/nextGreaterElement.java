// 102. Next Greater Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nextGreaterElement{
    public static int[] nextLargest(int[] nums){
        int[] temp = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1;i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                temp[i] = 0;
            }
            else temp[i] = stack.peek();
            stack.push(nums[i]);
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = nextLargest(nums);
        System.out.println(Arrays.toString(result));
    }
}