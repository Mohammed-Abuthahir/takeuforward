// 178. Longest subarray with sum K
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestSubarray{
    public static int longestSubarray(int[] nums, int k){
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for(int i = 0;i < nums.length; i++){
            sum = sum + nums[i];
            if(sum == k) maxLen = i + 1;
            long rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(rem)){
                map.put(sum, i);
            }
        }
        return maxLen;
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
        System.out.println("Enter the K : ");
        int k = scan.nextInt();
        int result = longestSubarray(nums, k);
        System.out.println(result);
    }
}