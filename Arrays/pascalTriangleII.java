// 378. Pascal's Triangle II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pascalTriangleII{
    public static int[] pascalTriangle(int r){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i <= r; i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i) ans.add(1);
                else ans.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(ans);
        }
        int[] arr = new int[result.get(r - 1).size()];
        int idx = 0;
        for(int num : result.get(r - 1)){
            arr[idx++] = num;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        int[] result = pascalTriangle(r);
        System.out.println(Arrays.toString(result));
    }
}