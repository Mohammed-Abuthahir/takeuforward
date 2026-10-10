// 16. Longest Substring Without Repeating Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestNonRepeatingSubstring{
    public static int longestnonrepeating(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0; int max = 0;
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int result = longestnonrepeating(s);
        System.out.println(result);
    }
}