package DSA.Loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int isPrime = 1 ;
        for(int i=2;i*i<=n;i++){
            if (n%i==0) {
                isPrime = 0;
            }
        }
        if (isPrime ==1) {
            System.out.println("The number n is prime :-" + n);        
        }else{
            System.out.println("The number n is not a prime:-" + n);
        }
        sc.close();
    }
}
