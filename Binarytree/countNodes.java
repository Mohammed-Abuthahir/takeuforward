// 263. Count total nodes in a complete BT
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countNodes{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void countNode(TreeNode root, ArrayList<Integer> nums){
        if(root == null) return;
        nums.add(root.val);
        countNode(root.left, nums);
        countNode(root.right, nums);
    }
    public static int countNode(TreeNode root){
        ArrayList<Integer> nums = new ArrayList<>();
        countNode(root, nums);
        return nums.size();
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        int result = countNode(root);
        System.out.println(result);
    }
}