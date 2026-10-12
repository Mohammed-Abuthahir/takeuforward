// 211. Palindrome Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isPalindrome{
    public static boolean isPalindrome(String num, int left, int right){
        if(left > right) return true;
        if(num.charAt(left) != num.charAt(right)) return false;
        return isPalindrome(num, left + 1, right - 1);
    }
    public static boolean palindrome(int n){
        String num = String.valueOf(n);
        int left = 0;
        int right = num.length() - 1;
        return isPalindrome(num, left, right);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scan.nextInt();
        boolean result = palindrome(n);
        System.out.println(result);
    }
}