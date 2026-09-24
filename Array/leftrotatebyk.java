package DSA.Array;

public class leftrotatebyk {
    
    public static void rotateBruteForce(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 
        
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        
        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }
        
        for(int i = n - d; i < n; i++){
            arr[i] = temp[i - (n - d)];
        }
    }

    public static void rotateOptimal(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        
        reverse(arr, 0, d - 1); 
        reverse(arr, d, n - 1); 
        reverse(arr, 0, n - 1); 
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++; 
            end--;   
        }
    }

    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int d1 = 8;
        rotateBruteForce(arr1, d1);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();

        int arr2[] = {1, 2, 3, 4, 5, 6};
        int d2 = 2; 
        rotateOptimal(arr2, d2);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}