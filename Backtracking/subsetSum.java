// 6. Subsets I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class subsetSum{
    public static void getAllSubsets(List<Integer> arr, List<Integer> list, int[] nums, int idx){
        int sum = 0;
        for(int i = 0;i < list.size(); i++){
            sum = sum + list.get(i);
        }
        arr.add(sum);
        for(int i = idx; i < nums.length; i++){
            list.add(nums[i]);
            getAllSubsets(arr, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
    public static List<Integer> subsetsum(int[] nums){
        List<Integer> arr = new ArrayList<>();
        getAllSubsets(arr, new ArrayList<>(), nums, 0);
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
        List<Integer> result = subsetsum(nums);
        System.out.println(result);
    }
}