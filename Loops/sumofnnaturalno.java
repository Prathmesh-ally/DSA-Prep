package DSA.Loops;

import java.util.Scanner;

public class sumofnnaturalno {
     public static void main(String[] args) {
        System.out.println("The the no. till you wanted the sum of it :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        int i = 1;
        while (i<=n) {
            sum = sum + i;
            i++;
            System.out.println(sum);
        }
        System.out.println(sum);
        sc.close();
     }
}
