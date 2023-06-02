import java.util.Scanner;

public class returndatatype {
    public static void main(String[] args) {
        int msg=greet();
        System.out.println(msg);

        float division=div();
        System.out.println(division);
    }
    static int greet(){
        int greet=65757;
        return greet;
    }
    static float div(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number1:");
        float a= in.nextFloat();
        System.out.println("Enter number2:");
        float b= in.nextFloat();
        float div=a/b;
        System.out.println("The value:");
        return div;
    }
}
