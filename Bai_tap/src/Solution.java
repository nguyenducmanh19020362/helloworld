import java.util.*;
public class Solution {
    //Type your main code here
    public static boolean jasuo(int a){
        for(int i = 2; i <= Math.sqrt(a);i++){
            if(a % i == 0)return false;
        }
        return true;
    }
    public static void primes(int n){
        for(int i = 2; i <= n; i++){
            if(jasuo(i)){
                System.out.printf("%d ",i);
            }
        }
    }
    public static void main(String []args){
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        primes(n);
    }
}
