// 79. Longest Common Prefix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestCommonPrefix{
    public static String longestCommon(String[] nums){
        Arrays.sort(nums);
        int idx = 0;
        while(idx < nums[0].length() && idx < nums[nums.length - 1].length()){
            if(nums[0].charAt(idx) == nums[nums.length - 1].charAt(idx)){
                idx++;
            }
            else break;
        }
        return nums[0].substring(0, idx);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the String : ");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.next();
        }
        String result = longestCommon(nums);
        System.out.println(result);
    }
}