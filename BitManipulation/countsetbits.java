// 14. Count the Number of Set Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countsetbits{
    public static int countSetBits(int n){
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(char c : binary.toCharArray()){
            if((c - '0') == 1) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        int result = countSetBits(n);
        System.out.print(result);
    }
}