import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 7;
        int a = 0;
        int b = 1;
        int count = 0;


        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(b);
        }

    }
}