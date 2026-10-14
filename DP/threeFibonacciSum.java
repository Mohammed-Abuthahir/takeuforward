// 4078. Three Fibonacci Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class threeFibonacciSum{
    public static boolean threeFibonacci(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        List<Integer> arr = new ArrayList<>();
        arr.add(0); arr.add(1);
        for(int i = 2; i <= n; i++){
            arr.add(arr.get(i - 1) + arr.get(i - 2));
            int sum = arr.get(i) + arr.get(i - 1) + arr.get(i - 2);
            if(sum > n) return false;
            if(sum == n) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        boolean result = threeFibonacci(n);
        System.out.println(result);
    }
}