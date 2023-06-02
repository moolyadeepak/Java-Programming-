import java.util.Scanner;

public class sumofnaturalsnumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int i =0;

        int count = 0;

        for (i = 0; i <= 10; i++) {
            count += i;
            System.out.println(count);
//if u write sout inside the curly bracket then it will enter all numbers
        }

    }
}
