// 1000. Remove Duplicates from Unsorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class UnsortedremoveDuplicates{
    public static List<Integer> removeDuplicates(int[] nums){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        return new ArrayList<>(map.keySet());
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
        List<Integer> result = removeDuplicates(nums);
        System.out.println(result);
    }
}