// 189. Reverse every word in a string
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class reverseWords{
    public static String reverseWords(String s){
        s = s.replaceAll(" \\s+", " ");
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1;i >= 0; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        String result = reverseWords(s);
        System.out.println(result);
    }
}