// Sort Frequency by Character
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortFrequency{
    public static List<Character> sortFreq(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(b) - map.get(a);
            }
            else return Integer.compare(a, b);
        });
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        List<Character> result = sortFreq(s);
        System.out.println(result);
    }
}