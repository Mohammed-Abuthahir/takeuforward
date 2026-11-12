// 74. Search a 2D Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class searchMatrix{
    public static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; int bottom = m - 1;
        int row = -1;
        while(top <= bottom){
            int mid = top + (bottom - top) / 2;
            if(matrix[mid][0] <= target && matrix[mid][n - 1] >= target) {
                row = mid;
                break;
            }
            else if(matrix[mid][0] > target){
                bottom = mid - 1;
            }
            else top = mid + 1;
        }
        if(row == -1) return false;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] mat = new int[row][col];
        for(int i = 0;i < mat.length; i++){
            for(int j = 0;j < mat[i].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Target : ");
        int target = scan.nextInt();
        boolean result = searchMatrix(mat, target);
        System.out.println(result);
    }
}