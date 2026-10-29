// 119. Majority Element-II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class majorityElementTwo{
    public static List<Integer> majority(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> arr = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > n / 3){
                arr.add(key);
            }
        }
        return arr;
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
        List<Integer> result = majority(nums);
        System.out.println(result);
    }
}