// 101. Reverse a number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverse{
    public static int reverse(int n){
        int rem = 0;
        while(n != 0){
            int digit = n % 10 ;
            rem = rem * 10 + digit;
            n = n / 10;
        }
        return rem;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scan.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }
}