// 745. Check for Perfect Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isPerfect{
    public static boolean isperfect(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
            if(sum > n) return false;
        }
        return sum == n;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        boolean result = isperfect(n);
        System.out.println(result);
    }
}