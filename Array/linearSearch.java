package DSA.Array;

public class linearSearch {
    public static int linearSearching(int numbers[],int key){
        for(int i=0; i<numbers.length;i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int akkde []={2,4,6,8,10,12,14,16,18,20};
        int target=10;
        System.out.println("Target found at index: " + linearSearching(akkde, target));    
    }
}
