// Build the Binary Search Tree From Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class BuildBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode build(int[] arr, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = build(arr, left, mid - 1);
        root.right = build(arr, mid + 1, right);
        return root;
    }
    public static TreeNode BuildBinarySearchTree(int[] arr){
        return build(arr, 0, arr.length - 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] arr = new int[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        TreeNode result = BuildBinarySearchTree(arr);
        System.out.println("Binary Search Tree : ");
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}