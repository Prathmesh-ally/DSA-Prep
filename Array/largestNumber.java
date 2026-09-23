package DSA.Array;
public class largestNumber {
    public static int largestEle(int array[] , int largeNum){
        for(int i=0;i<array.length;i++){
            if(largeNum<array[i]){
                largeNum = array[i];
            }
        }
        return  largeNum;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,254,16,18,20};
        int largestNum = Integer.MIN_VALUE;    

        System.out.println("The largest no. in the given array is :- " + largestEle(numbers,largestNum));
    }
}
