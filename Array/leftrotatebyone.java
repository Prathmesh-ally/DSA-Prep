package DSA.Array;

public class leftrotatebyone {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        arrayRotateLeft(arr);

        for(int i=0; i<arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static void arrayRotateLeft(int arr[]){
        int temp = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
