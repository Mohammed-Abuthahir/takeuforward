// 168. Postorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class postOrder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void postorderTraversel(TreeNode root, List<Integer> nums){
        if(root == null) return;
        postorderTraversel(root.left, nums);
        postorderTraversel(root.right, nums);
        nums.add(root.val);
    }
    public static List<Integer> postorder(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        postorderTraversel(root, nums);
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = postorder(root);
        System.out.println(result);
    }
}