// 324. Rotate String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rotateString{
    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;
        String newstr = s + s;
        return newstr.indexOf(goal) != -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        System.out.println("Enter the Goal : ");
        String goal = scan.next();
        boolean result = rotateString(s, goal);
        System.out.println(result);
    }
}