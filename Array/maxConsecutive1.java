package DSA.Array;

public class maxConsecutive1 {
    public static int maxConsecutive(int arr[]){
        int maxCount =0;
        int currentCount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                currentCount++;
                if(currentCount > maxCount){
                    maxCount = currentCount;
                }
            }else{
                currentCount = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int array[] = {1,1,1,0,0,1,0,1,1,1,1};
        System.out.println("The max consecutive count for 1 is :- " + maxConsecutive(array));    
    }
}
