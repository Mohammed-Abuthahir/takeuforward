// 204. Zig Zag or Spiral Traversal
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class zigzagLevelOrder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); boolean toggle = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> nums = new ArrayList<>();
            for(int i = 0;i < size; i++){
                TreeNode curr = queue.poll();
                if(toggle)  nums.addLast(curr.val);
                else nums.addFirst(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(nums);
            toggle = !toggle;
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = zigzagLevelOrder(root);
        System.out.println(result);
    }
}