package DSA.Loops;

import java.util.Scanner;

public class PracticeQuestions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Question 1 : How many times 'Hello' is printed?
                public class Solution {
                    public static void main(String[] args){
                        for(int i=0; i<5; i++) {
                            System.out.println("Hello");
                            i+=2;
                        }
                    }
                }
            Answer : It will print 'Hello' 2 times.
            (Trace: i=0 prints 1st time, then i becomes 2. Loop update makes i=3. 
            i=3 prints 2nd time, then i becomes 5. Loop breaks.)
        */

        // Question 2 : Write a program that reads a set of integers, and then prints the sum of the
        // even and odd integers.
        int sumEven = 0;
        int sumOdd = 0;
        
        while (true) {
            System.out.println("For closing the calculation Enter -1");
            System.out.println("Enter a number you want to add :- ");
            int n = sc.nextInt();
            
            if (n == -1) {
                System.out.println("Exiting....");
                break;
            }
            
            if (n % 2 == 0) {
                sumEven = sumEven + n;
                System.out.println("The number you entered was even :- " + sumEven);
            } else {
                sumOdd = sumOdd + n;
                System.out.println("The number you entered was odd :- " + sumOdd);
            }
        }
        
        System.out.println("The total sum of even is : " + sumEven);
        System.out.println("The total sum of odd is : " + sumOdd);

        /*
            Question 3 : Write a program to find the factorial of any number entered by the user.
            (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
            only. We write factorial as n!
            So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
            Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
        */

        System.out.println("\nEnter a number to find its factorial: ");
        int fact = 1;
        int factInput = sc.nextInt();
        
        if (factInput < 0) {
            System.out.println("Enter positive number only");
        } else {
            for(int i = 1; i <= factInput; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial for " + factInput + " is: " + fact);
        }

        // Question 4 : Write a program to print the multiplication table of a number N, entered by the user
        System.out.println("\nEnter a number for the multiplication table: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }    
        
        sc.close();

        /*
            Question 5 : What is wrong in the following program?
                public class Solution {
                    public static void main(String args[]) {
                        for(int i = 0; i <= 5; i++ ) {
                            System.out.println("i = " + i );
                        }
                        System.out.println("i after the loop = " + i );
                    }
                }
                    
            Answer : 'i' will not be printed in the last line because it is declared inside the for loop. 
            Its scope is limited to the loop only, which will cause a compilation error.
        */
    }
}