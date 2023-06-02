
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value");


        int x= input.nextInt();
        int y= input.nextInt();
        System.out.println("Before a swapping: "+x+" "+ y);
       // swap(x,y);
        System.out.println("After swapping: "+y+" "+x);

    }

     void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;



    }
}
