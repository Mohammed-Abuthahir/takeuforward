// 9. K-th Largest element in an array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kthLargestElement{
    public static int kthLargestElement(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int num : nums) pq.add(num);
        int idx = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            nums[idx++] = num;
        }
        return nums[k + 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = kthLargestElement(nums, k);
        System.out.println(result);
    }
}