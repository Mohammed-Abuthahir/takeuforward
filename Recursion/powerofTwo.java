// 289. Check if a Number is Power of 2 or Not
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class powerofTwo{
    public static boolean powerofTwo(int n){
        if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        return powerofTwo(n / 2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        boolean result = powerofTwo(n);
        System.out.println(result);
    }
}