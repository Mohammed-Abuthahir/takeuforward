// 59. Find the Duplicate Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findDuplicate{
    public static int findDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
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
        int result = findDuplicates(nums);
        System.out.println("Duplicates Number is to :"result);
    }
}