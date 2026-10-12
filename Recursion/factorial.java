// 908. Factorial of a given number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class factorial{
    public static int factorial(int n){
        if(n <= 1) return n;
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}