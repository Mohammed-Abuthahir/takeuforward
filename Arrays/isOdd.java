// 717. Check if a Number is Odd or Not
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isOdd{
    public static boolean isOdd(int n){
        return n % 2 != 0 ? true : false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        boolean result = isOdd(n);
        System.out.println(result);
    }
}
