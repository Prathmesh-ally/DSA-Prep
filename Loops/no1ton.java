package DSA.Loops;

import java.util.Scanner;

public class no1ton {
    public static void main(String[] args) {
        System.out.println("Enter the n no. you want :" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        while (j<=n) {
            System.out.println("The Value is :" + j);
            j++;
        }
        sc.close();
    }
}
