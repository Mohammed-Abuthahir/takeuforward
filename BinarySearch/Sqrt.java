// Square Root
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Sqrt{
    public static int sqrt(int x){
        long left = 0; long right = x / 2;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long sqrt = mid * mid;
            if(sqrt == x) return (int) mid;
            else if(sqrt < x) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the X : ");
        int x = scan.nextInt();
        int result = sqrt(x);
        System.out.println(result);
    }
}