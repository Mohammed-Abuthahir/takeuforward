// 296. Highest Occurring Element in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mostFrequentElement{
    public static int mostFrequentElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int max = Collections.max(map.values());
        int min = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            if(key == max){
                min = Math.min(min, key);
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = mostFrequentElement(nums);
        System.out.println(result);
    }
}