// 194. Next Smaller Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nextSmallerElements{
    public static int[] nextSmaller(int[] nums){
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() >= nums[i]){
                stack.pop();
            }
            int temp = nums[i];
            if(stack.isEmpty()) nums[i] = -1;
            else nums[i] = stack.peek();
            stack.push(temp);
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums =  new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = nextSmaller(nums);
        System.out.println(Arrays.toString(result));
    }
}