// 833. Calculate Frequency of Characters in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class characterFrequency{
    public static String characterFreq(String s){
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : map.keySet()){
            sb.append(c);
            sb.append(map.get(c));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        String result = characterFreq(s);
        System.out.println(result);
    }
}