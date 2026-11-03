import java.util.*;

class recoverTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    
    public void findSwapped(TreeNode root) {
        if(root == null) return;
        findSwapped(root.left);
        if(prev != null && prev.val > root.val){
            if(first == null) {
                first = prev; 
            }
            second = root;  
        }
        prev = root;
        findSwapped(root.right);
    }
    // Recover the tree by swapping values back
    public void recover(TreeNode root) {
        findSwapped(root);
        if (first != null && second != null) {
            int temp = second.val;
            second.val = first.val;
            first.val = temp;
        }
    }
    
    // Helper to print tree in-order
    public static void printInorder(TreeNode root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        System.out.println("Before recovery (In-order):");
        printInorder(root);
        System.out.println();
        recoverTree solver = new recoverTree();
        solver.recover(root);
        System.out.println("After recovery (In-order):");
        printInorder(root);
    }
}