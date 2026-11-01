// Count Sum Pairs in Sorted
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countPairs{
    public static int countPairs(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            int compliment = target - num;
            if(map.containsKey(compliment)){
                count = count + map.get(compliment);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = scan.nextInt();
        int result = countPairs(nums, target);
        System.out.println(result);
    }
}