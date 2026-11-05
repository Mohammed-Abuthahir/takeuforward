// 707. Find row with maximum 1's
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rowWithMax1s{
    public static int rowwithmax(int[][] nums){
        int max = 0;
        int idx = -1;
        for(int i = 0;i < nums.length; i++){
            int count = 0;
            for(int j = 0;j < nums[i].length; j++){
                if(nums[i][j] == 1){
                    count++;
                }
            }
            if(max < count){
                max = count;
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = rowwithmax(nums);
        System.out.println("Index :" +result);
    }
}