// 294. Reverse a String I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseString{
    public static ArrayList<Character> reverse(ArrayList<Character> nums){
        int left = 0;
        int right = nums.size() - 1;
        while(left <= right){
            char temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);
            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Character>  nums = new ArrayList<>(Arrays.asList('H','e','L','L','o'));
        ArrayList<Character> result = reverse(nums);
        System.out.println(result);
    }
}