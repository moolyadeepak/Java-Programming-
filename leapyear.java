import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter Value");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        if(a%4==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap Year");
        }
    }
}
