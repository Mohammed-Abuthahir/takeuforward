// 278. Check if String is Palindrome or Not
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class palindromeCheck{
    public static boolean palindrome(String s){
        int left = 0; int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        boolean result = palindrome(s);
        System.out.println(result);
    }
}