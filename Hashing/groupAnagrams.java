// 137. Group Words by Anagrams
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class groupAnagrams{
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        String[] s = new String[n];
        for(int i = 0;i < s.length(); i++){
            s[i] = scan.next();
        }
        List<List<String>> result = groupAnagrams(s);
        System.out.println(result);
    }
}