// 103. Delete a node in BST
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class deleteNode{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode deleteNodes(TreeNode root, int val){
        if(root == null) return null;
        if(val < root.val){
            root.left = deleteNodes(root.left, val);
        }
        else if(val > root.val){
            root.right = deleteNodes(root.right, val);
        }
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            TreeNode successor = root.right;
            while(successor.left != null){
                successor = successor.left;
            }
            root.val = successor.val;
            root.right = deleteNodes(root.right, successor.val);
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int val = 3;
        TreeNode result = deleteNodes(root, val);
        display(root);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}