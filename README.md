# 🚀 Striver A2Z DSA - Pattern Problems (Java)

Welcome to my Java Patterns repository! This collection contains optimized, 0-based indexing solutions for the pattern problems from the **Striver A2Z DSA Sheet**. 

Understanding these patterns builds a strong foundation for nested loops, coordinate math, and matrix manipulations in Data Structures and Algorithms.

## 📊 Patterns Breakdown

| # | Pattern Name | Design (n=4) | Core Code Snippet | Basic Logic / Hint |
| :--- | :--- | :--- | :--- | :--- |
| **1** | **Square** | <pre>****<br>****<br>****<br>****</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n; j++)` | Print `*` for an `n x n` grid. Simple rows and columns. |
| **2** | **Left Triangle** | <pre>*<br>**<br>***<br>****</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)` | Inner loop runs relative to the current row number `i`. |
| **3** | **Number 123** | <pre>1<br>12<br>123<br>1234</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)`<br>`    print(j + 1);` | Print column index `(j+1)` to get sequential numbers across a row. |
| **4** | **Number 122333** | <pre>1<br>22<br>333<br>4444</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<=i; j++)`<br>`    print(i + 1);` | Print row index `(i+1)` to keep the number same across the entire row. |
| **5** | **Inverse Star** | <pre>****<br>***<br>**<br>*</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n-i; j++)` | Shrink inner loop limit using `n - i` math. |
| **6** | **Inverse Number** | <pre>1234<br>123<br>12<br>1</pre> | `for(int i=0; i<n; i++)`<br>`  for(int j=0; j<n-i; j++)`<br>`    print(j + 1);` | Same reverse math as Pattern 5, just print column index `(j+1)`. |
| **7** | **Centered Pyramid** | <pre>   *<br>  ***<br> *****<br>*******</pre> | Spaces: `for(j=0; j<n-i-1; j++)`<br>Stars: `for(k=0; k<2*i+1; k++)` | 3 parts: Space, Stars, Space. Stars increase by odd numbers `2*i+1`. |
| **8** | **Inverse Pyramid** | <pre>*******<br> *****<br>  ***<br>   *</pre> | `for(int i=n-1; i>=0; i--)`<br> *Same inner loops as P7* | Smart Trick: Run the outer loop in reverse (`n-1` to `0`). Inner math stays same! |
| **9** | **Diamond** | <pre>   *<br>  ***<br> *****<br>*******<br>*******<br> *****<br>  ***<br>   *</pre> | `printPyramid();`<br>`printInversePyramid();` | Merge Pattern 7 and Pattern 8 logic sequentially. |
| **10** | **Rotate Right**<br>(Half Diamond) | <pre>*<br>**<br>***<br>****<br>***<br>**<br>*</pre> | `for(i=0; i<n; i++)`<br>  *Ascent logic*<br>`for(i=1; i<n; i++)`<br>  *Descent logic* | 2 outer loops. 1st builds the peak, 2nd starts from `n-1` stars to avoid a double peak. |
| **11** | **Binary Triangle** | <pre>1<br>01<br>101<br>0101</pre> | `if(start == 1) start = 0;`<br>`else start = 1;` | Even rows start with `1`, odd with `0`. Flip the variable after every print. |
| **12** | **DripStone**<br>(Number Crown) | <pre>1      1<br>12    21<br>123  321<br>12344321</pre> | Numbers: `for(j=0; j<=n-i-1; j++)`<br>Spaces: `for(k=0; k<2*i; k++)`<br>Mirror: `for(j=n-i-1; j>=0; j--)` | Uses reverse outer loop. Pattern has 3 blocks: Left ASC, Spaces (decreases by 2), Right DESC. |
| **13** | **Incremental**<br>(Floyd's Triangle) | <pre>1<br>2 3<br>4 5 6<br>7 8 9 10</pre> | `int num = 1;`<br> *Inside inner loop:*<br>`print(num); num++;` | Initialize counter outside all loops. Increment it right after printing. |
| **14** | **Alphabets** | <pre>A<br>AB<br>ABC<br>ABCD</pre> | `char ch = 'A';`<br>`for(j=0; j<=i; j++)`<br>`  print(ch); ch++;` | Reset `char` at the start of every new row (inside outer loop). |
| **15** | **Reverse Alpha** | <pre>ABCD<br>ABC<br>AB<br>A</pre> | `for(int i=n-1; i>=0; i--)`<br>`  char c = 'A';` | Same logic as Pattern 14, but outer loop runs in reverse gear. |
| **16** | **Symmetric Alpha** | <pre>A<br>BB<br>CCC<br>DDDD</pre> | `char c = 'A';`<br>`for(i=0; i<n; i++)`<br>  *Inner Loop prints `c`*<br>`  c++;` | `char` is initialized outside all loops and incremented *after* the inner loop finishes a row. |

## 🛠️ Tech Stack & Concepts Used
* **Language:** Java
* **Concepts:** Nested Loops, 0-Based Indexing, Coordinate Geometry Math, ASCII Manipulations.
* **Paradigm:** Algorithm Optimization (Minimizing loops, dynamic conditions).

## 🚀 How to Run
1. Clone the repository to your local machine.
2. Open `Main.java` in your favorite IDE (VS Code, IntelliJ, Eclipse).
3. Run the file and input the value of `n` when prompted.
