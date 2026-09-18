# 🚀 DSA - Pattern Problems (Java)

Welcome to my Java Patterns repository! This collection contains optimized, 0-based indexing solutions for fundamental pattern problems. 

Understanding these patterns builds a strong foundation for nested loops, coordinate math, and matrix manipulations in Data Structures and Algorithms.

## 📊 Patterns Breakdown

| # | Pattern Name | Design (n=4) | Core Code Snippet | Basic Logic / Hint |
| :--- | :--- | :--- | :--- | :--- |
| **1** | **Square** | &#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42; | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n; j++)` | Print `*` for an `n x n` grid. Simple rows and columns. |
| **2** | **Left Triangle** | &#42;<br>&#42;&#42;<br>&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42; | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)` | Inner loop runs relative to the current row number `i`. |
| **3** | **Number 123** | 1<br>12<br>123<br>1234 | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)`<br>`    print(j + 1);` | Print column index `(j+1)` to get sequential numbers across a row. |
| **4** | **Number 122333** | 1<br>22<br>333<br>4444 | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)`<br>`    print(i + 1);` | Print row index `(i+1)` to keep the number same across the entire row. |
| **5** | **Inverse Star** | &#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;<br>&#42;&#42;<br>&#42; | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n-i; j++)` | Shrink inner loop limit using `n - i` math. |
| **6** | **Inverse Number** | 1234<br>123<br>12<br>1 | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n-i; j++)`<br>`    print(j + 1);` | Same reverse math as Pattern 5, just print column index `(j+1)`. |
| **7** | **Centered Pyramid** | &nbsp;&nbsp;&nbsp;&#42;<br>&nbsp;&nbsp;&#42;&#42;&#42;<br>&nbsp;&#42;&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;&#42;&#42;&#42; | Spaces: `for(j=0; j<n-i-1; j++)`<br>Stars: `for(k=0; k<2*i+1; k++)` | 3 parts: Space, Stars, Space. Stars increase by odd numbers `2*i+1`. |
| **8** | **Inverse Pyramid** | &#42;&#42;&#42;&#42;&#42;&#42;&#42;<br>&nbsp;&#42;&#42;&#42;&#42;&#42;<br>&nbsp;&nbsp;&#42;&#42;&#42;<br>&nbsp;&nbsp;&nbsp;&#42; | `for(int i=n-1; i>=0; i--)`<br> *Same inner loops as P7* | Smart Trick: Run the outer loop in reverse (`n-1` to `0`). Inner math stays same! |
| **9** | **Diamond** | &nbsp;&nbsp;&nbsp;&#42;<br>&nbsp;&nbsp;&#42;&#42;&#42;<br>&nbsp;&#42;&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;&#42;&#42;&#42;<br>&nbsp;&#42;&#42;&#42;&#42;&#42;<br>&nbsp;&nbsp;&#42;&#42;&#42;<br>&nbsp;&nbsp;&nbsp;&#42; | `printPyramid();`<br>`printInversePyramid();` | Merge Pattern 7 and Pattern 8 logic sequentially. |
| **10** | **Rotate Right**<br>(Half Diamond) | &#42;<br>&#42;&#42;<br>&#42;&#42;&#42;<br>&#42;&#42;&#42;&#42;<br>&#42;&#42;&#42;<br>&#42;&#42;<br>&#42; | `for(i=0; i<n; i++)`<br>  *Ascent logic*<br>`for(i=1; i<n; i++)`<br>  *Descent logic* | 2 outer loops. 1st builds the peak, 2nd starts from `n-1` stars to avoid a double peak. |
| **11** | **Binary Triangle** | 1<br>01<br>101<br>0101 | `if(start == 1) start = 0;`<br>`else start = 1;` | Even rows start with `1`, odd with `0`. Flip the variable after every print. |
| **12** | **DripStone**<br>(Number Crown) | 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1<br>12&nbsp;&nbsp;&nbsp;&nbsp;21<br>123&nbsp;&nbsp;321<br>12344321 | Numbers: `for(j=0; j<=n-i-1; j++)`<br>Spaces: `for(k=0; k<2*i; k++)`<br>Mirror: `for(j=n-i-1; j>=0; j--)` | Uses reverse outer loop. Pattern has 3 blocks: Left ASC, Spaces (decreases by 2), Right DESC. |
| **13** | **Incremental**<br>(Floyd's Triangle) | 1<br>2 3<br>4 5 6<br>7 8 9 10 | `int num = 1;`<br> *Inside inner loop:*<br>`print(num); num++;` | Initialize counter outside all loops. Increment it right after printing. |
| **14** | **Alphabets** | A<br>AB<br>ABC<br>ABCD | `char ch = 'A';`<br>`for(j=0; j<=i; j++)`<br>`  print(ch); ch++;` | Reset `char` at the start of every new row (inside outer loop). |
| **15** | **Reverse Alpha** | ABCD<br>ABC<br>AB<br>A | `for(int i=n-1; i>=0; i--)`<br>`  char c = 'A';` | Same logic as Pattern 14, but outer loop runs in reverse gear. |
| **16** | **Symmetric Alpha** | A<br>BB<br>CCC<br>DDDD | `char c = 'A';`<br>`for(i=0; i<n; i++)`<br>  *Inner Loop prints `c`*<br>`  c++;` | `char` is initialized outside all loops and incremented *after* the inner loop finishes a row. |

## 💻 Full Source Code (`Main.java`)

Below is the complete, compiled Java code containing all 16 patterns with a menu-driven scanner input.

```java
import java.util.Scanner;

public class Main {
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
}
