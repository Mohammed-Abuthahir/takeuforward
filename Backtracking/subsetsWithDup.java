// 128. Subsets II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class subsetsWithDup{
    public static void getAllSubset(LinkedHashSet<List<Integer>> result, ArrayList<Integer> arr, int[] nums, int idx){
        result.add(new ArrayList<>(arr));
        for(int i = idx;i < nums.length; i++){
            arr.add(nums[i]);
            getAllSubset(result, arr, nums, i + 1);
            arr.remove(arr.size() - 1);
        }
    }
    public static List<List<Integer>> subsetWithDup(int[] nums){
        Arrays.sort(nums);
        LinkedHashSet<List<Integer>> result = new LinkedHashSet<>();
        getAllSubset(result, new ArrayList<>(), nums, 0);
        return new ArrayList<>(result);
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
        List<List<Integer>> result = subsetWithDup(nums);
        System.out.println(result);
    }
}