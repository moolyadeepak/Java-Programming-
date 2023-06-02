import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        //int[] arr;
        int count=0;

        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;

            }
        }

        if (count > 0) {
            System.out.println("Its composite");
        }
        else{
            System.out.println("Its prime");
        }
    }
}
