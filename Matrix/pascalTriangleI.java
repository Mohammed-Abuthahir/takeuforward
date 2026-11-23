// 161. Pascal's Triangle I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class pascalTriangleI{
    public static int pascalTriangle(int r, int c){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i <= r; i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j <= i; j++){
                if(j == 0 || j == i) ans.add(1);
                else ans.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if(i == r - 1) return ans.get(c - 1);
            result.add(ans);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int r = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int c = scan.nextInt();
        int result = pascalTriangle(r, c);
        System.out.println(result);
    }
}