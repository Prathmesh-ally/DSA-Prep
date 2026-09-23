package DSA.Array;

public class binarySearch {
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;
        
        int index = binarySearchh(numbers, key);
        System.out.println("Key found at index: " + index);
    }

    public static int binarySearchh(int array[], int key){
        
        int start = 0;
        int end = array.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
