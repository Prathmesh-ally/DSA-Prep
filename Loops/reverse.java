package DSA.Loops;

public class reverse {
    public static void main(String[] args) {
        int n = 10899;
        int step = 1; // Ye bas round count karne ke liye hai

        System.out.println("--- Shuruwat ---");
        
        while (n > 0) {
            System.out.println("Round " + step + ":");
            System.out.println("  Old 'n' value : " + n);
            
            // 1. Aakhri digit nikalna
            int lastDigit = n % 10;
            System.out.println("  lastDigit (n % 10) : " + lastDigit);
            
            // 2. Aakhri digit hatana (n ko update karna)
            n = n / 10;
            System.out.println("  New updated 'n' : " + n);
            
            System.out.println("------------------------");
            step++; // Agle round ke liye step badha do
        }
        
        System.out.println("--- Loop Khatam kyunki n ab 0 ho gaya ---");
    }
}