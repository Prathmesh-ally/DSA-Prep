package DSA.Loops;

public class breakandcontinue {
    public static void main(String[] args) {
        for(int i=0 ; i<=5 ; i++){
            if (i==3) {
                break;
            }
            System.out.println(i);
        }   
        System.out.println("Im out beacuase of break");
        for(int i=0 ; i<=5 ; i++){
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }   
        System.out.println("Im out beacuase of continue");
    }
}