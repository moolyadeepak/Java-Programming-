import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();


        heey h1= new heey();
        h1.di(12,54);

    }

        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter no:");
            int a = in.nextInt();
            System.out.println("Enter no:");
            int b = in.nextInt();
            int sum = a + b;
            System.out.println("the result " + sum);

        }
    }

    class heey{
    void di(int a,int b){
        System.out.println("addition: "+(a+b));
    }
    }