// 98. Top K Frequent Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class topKFrequent{
    public static int[] kfrequentElements(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int idx = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            nums[idx++] = num;
        }
        return Arrays.copyOf(nums, k);
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
        System.out.println("Enter the K : ");
        int k = scan.nextInt();
        int[] result = kfrequentElements(nums, k);
        System.out.println(Arrays.toString(result));
    }
}