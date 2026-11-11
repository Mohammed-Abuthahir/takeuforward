// 790. Count of Prime Numbers till N
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class primeUptoN{
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2;i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primeuptoN(int n){
        int count = 0;
        for(int i = 1;i <= n; i++){
            if(isprime(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        int result = primeuptoN(n);
        System.out.println(result);
    }
}