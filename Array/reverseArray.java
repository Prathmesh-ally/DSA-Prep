package DSA.Array;
public class reverseArray {
    public static void reverse(int array[]){
        int start = 0 ;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;end--;
        }

        for(int i=0 ; i<array.length; i++){
            System.out.print( array[i] +" ");
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,254,16,18,20};
        reverse(numbers);
    }
}
