import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Value");
        int n= input.nextByte();
        int i=1;

        while(i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}
