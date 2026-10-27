// 27. Median of 2 sorted arrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class medianTwoArrays{
    public static double median(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];
        int idx = 0;
        for(int i = 0;i < nums1.length; i++) arr[idx++] = nums1[i];
        for(int i = 0;i < nums2.length; i++) arr[idx++] = nums2[i];
        int left = 0;  int right = arr.length - 1;
        int mid = left + (right - left) / 2;
        if(arr.length % 2 == 0){
            return (double) (arr[mid] + arr[mid + 1]) / 2;
        }
        return (double) arr[mid];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1 : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2 : ");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1 : ");
        int[] nums1 = new int[n1];
        for(int i = 0;i < nums1.length; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the Arrays 2 : ");
        int[] nums2 = new int[n2];
        for(int i = 0;i < nums2.length; i++){
            nums2[i] = scan.nextInt();
        }
        double result = median(nums1, nums2);
        System.out.println(result);
    }
}