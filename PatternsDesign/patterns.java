import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("\n--- Pattern 1: Square ---");
        printSquare(n); 
        
        System.out.println("\n--- Pattern 2: Left Triangle ---");
        printLeftTriangle(n);

        System.out.println("\n--- Pattern 3: Number 123 ---");
        printNumber123(n);

        System.out.println("\n--- Pattern 4: Number 122333 ---");
        printNumber122333(n);

        System.out.println("\n--- Pattern 5: Inverse Star ---");
        printInverseStar(n);

        System.out.println("\n--- Pattern 6: Inverse Number ---");
        printInverseNumber(n);

        System.out.println("\n--- Pattern 7: Centered Pyramid ---");
        printPyramid(n);

        System.out.println("\n--- Pattern 8: Inverse Pyramid (Smart Way) ---");
        printInversePyramid(n);

        System.out.println("\n--- Pattern 9: Diamond ---");
        printDiamond(n);
        
        System.out.println("\n--- Pattern 10: Rotate Right Pyramid ---");
        printRotateRightPyramid(n);

        System.out.println("\n--- Pattern 11: 10 Triangle ---");
        print10Triangle(n);

        System.out.println("\n--- Pattern 12: Dripstone ---");
        printDripStone(n);

        System.out.println("\n--- Pattern 13: Incremental 123 Triangle ---");
        printIncremental123(n);

        System.out.println("\n--- Pattern 14: Alphabets ---");
        printAlphabets(n);

        System.out.println("\n--- Pattern 15: Reverse Alphabet Pyramid ---");
        reverseAlphabet(n);

        System.out.println("\n--- Pattern 16: Symmetric Alphabet ---");
        symmetricAlphabet(n);

        System.out.println("\n--- Pattern 17: Alphabet Pyramid ---");
        pyramidAlphabet(n);
        
        System.out.println("\n--- Pattern 18: Reverse Alpha Right Pyramid ---");
        reverseAlphaRightTriangle(n);

        System.out.println("\n--- Pattern 19: Hollow Diamond ---");
        hollowDiamond(n);
        
        System.out.println("\n--- Pattern 20: Butterfly ---");
        butterfly(n);

        System.out.println("\n--- Pattern 21: Hollow Square ---");
        hollowSquare(n);
        
        sc.close(); 
    }
    
    // Pattern 1
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Pattern 2
    public static void printLeftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void printNumber123(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1)); 
            }
            System.out.println(); 
        }
    }

    // Pattern 4
    public static void printNumber122333(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1)); 
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void printInverseStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 6
    public static void printInverseNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }

    // Pattern 7
    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 8
    public static void printInversePyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 9
    public static void printDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }     
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }     
            System.out.println();            
        }
    }

    // Pattern 10
    public static void printRotateRightPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 11
    public static void print10Triangle(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                if (start == 1) {
                    start = 0;
                } else {
                    start = 1;
                }
            }
            System.out.println();
        }
    }

    // Pattern 12
    public static void printDripStone(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(j + 1);
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // Pattern 13
    public static void printIncremental123(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Pattern 14
    public static void printAlphabets(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // Pattern 15
    public static void reverseAlphabet(int n) {
        for (int i = n - 1; i >= 0; i--) {
            char c = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    // Pattern 16
    public static void symmetricAlphabet(int n) {
        char c = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }

    // Pattern 17
    public static void pyramidAlphabet(int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch);
                if (k <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 18 
    public static void reverseAlphaRightTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    // Pattern 19
    public static void hollowDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) { 
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n - 1; i >= 0; i--) {    
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 20
    public static void butterfly(int n) {
        for (int i = n - 1; i >= 0; i--) {    
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) { 
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) { 
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 21
    public static void hollowSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
