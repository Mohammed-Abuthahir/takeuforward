// 225. Single Number - II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class singleNumber{
    public static int singleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int key : map.keySet()){
            if(map.get(key) == 1) return key;
        }
        return -1;
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
        int result = singleNumber(nums);
        System.out.println(result);
    }
}