import java.util.Scanner;

public class factorialfunc {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();


        int count = 1;

        for (int i = 1; i <=n; i++) {
            count *= i;

//if u write sout inside the curly bracket then it will enter all numbers
        }
        System.out.println(count);
    }
}
