// 2. Search X in sorted array
import java.util.*;
class SearchXinsortedarray{
    public static int search(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target : ");
        int target = scan.nextInt();
        int result = search(nums, target);
        System.out.println(result);
    }
}