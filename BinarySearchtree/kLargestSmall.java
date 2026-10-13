// 33. Kth Smallest and Largest element in BST
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kLargestSmall{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val = val;
        }
    }
    public static void findKlargeandsmall(TreeNode root, List<Integer> nums){
        if(root == null) return ;
        findKlargeandsmall(root.left, nums);
        nums.add(root.val);
        findKlargeandsmall(root.right, nums);
    }
    public static List<Integer> klargeandsmall(TreeNode root, int k){
        List<Integer> nums = new ArrayList<>();
        findKlargeandsmall(root, nums);
        return new ArrayList<>(Arrays.asList(nums.get(k -1), nums.get(nums.size() - k)));
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        int k = 1;
        List<Integer> result = klargeandsmall(root, k);
        System.out.println(result);
    }
}