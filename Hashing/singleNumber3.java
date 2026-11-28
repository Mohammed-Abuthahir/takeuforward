// 346. Single Number - III
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class singleNumber3{
    public static int[] singleNumber(int[] nums){
        int[] arr = new int[2]; 
        int idx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                arr[idx++] = key;
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
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = singleNumber(nums);
        System.out.println(Arrays.toString(result));
    }
}