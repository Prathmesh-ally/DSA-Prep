package DSA.PatternsDesign;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            
            System.out.println("\n--- Pattern 1 ---");
            printSquare(n); 
            
            System.out.println("\n--- Pattern 2 ---");
            printLeftTriangle(n);

            System.out.println("\n--- Pattern 3 ---");
            printNumber123(n);

            System.out.println("\n--- Pattern 4 ---");
            printNumber122333(n);

            System.out.println("\n--- Pattern 5 ---");
            printInverseStar(n);

            System.out.println("\n--- Pattern 6 ---");
            printInverseNumber(n);

            System.out.println("\n--- Pattern  ---");
            printAlphabets(n);
            sc.close(); 
        }
        
        public static void printSquare(int n) {
            for(int i = 1; i <= n; i++){
                System.out.println("****");
            }
        }
        
        public static void printLeftTriangle(int n) {
            for(int i = 1; i <= n ; i++){
                for(int j = 1; j <= i ; j++){ 
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void printNumber123(int n){
            for(int i=1 ; i<=n ; i++){
                for(int j=1 ; j<=i ; j++){
                    System.out.print(j);
                }
                System.out.println(); 
            }
        }

        public static void printNumber122333(int n){
            for(int i=1 ; i<=n ; i++){
                for(int j=1 ; j<=i ; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }

        public static void printInverseStar(int n){
            for(int i=1 ; i<=n ; i++){
                for(int j=n ; j>=i ; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void printInverseNumber(int n){
            for(int i=n ;i>=1 ; i--){
                for(int j=1 ; j<=i ; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void printAlphabets(int n){
            char ch='A';
            for(int i=1 ; i<=n ; i++){
                for(int j=1 ; j<=i ; j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
}


