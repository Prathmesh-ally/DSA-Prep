package DSA.Array;

public class secondLargest {
    
    public static int findSecondLarge(int arr[]) {
        int largestNumber = Integer.MIN_VALUE; 
        int secondLarge = Integer.MIN_VALUE; 

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largestNumber) {
                secondLarge = largestNumber; 
                largestNumber = arr[i];      
            } 
            else if (arr[i] < largestNumber && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int array[] = {50, 100, 70, 90, 80};
        System.out.println("The Second Largest Value Is: " + findSecondLarge(array));
    }
}