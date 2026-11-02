// 164. Balanced Paranthesis
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validParanthesis{
    public static boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if((c == ')' && ch != '(') || (c == ']' && ch != '[') && (c == '{' && ch != '}')) return false;
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        boolean result = validParanthesis(s);
        System.out.println(result);
    }
}