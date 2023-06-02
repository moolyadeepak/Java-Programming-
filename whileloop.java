import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Value");
        int n=input.nextInt();
        int i =0 ;
        while( i<=10){
            System.out.println(i*n);
            i++;
        }

    }
}

