// 195. Print root to leaf path in BT
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class allRootToLeaf{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void fillthelist(TreeNode root, List<List<Integer>> result, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.val);
        fillthelist(root.left, result, arr);
        fillthelist(root.right, result, arr);
        if(root.left == null && root.right == null){
            result.add(new ArrayList<>(arr));
        }
        arr.remove(arr.size() - 1);
    }
    public static List<List<Integer>> allRootToLeaf(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(root, result, new ArrayList<>());
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        List<List<Integer>> result = allRootToLeaf(root);
        System.out.println(result);
    }
}