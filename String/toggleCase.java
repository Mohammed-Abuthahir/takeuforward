// 837. Change Case of Each Character in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class toggleCase{
    public static String toggle(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z') sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        String result = toggle(s);
        System.out.println(result);
    }
}