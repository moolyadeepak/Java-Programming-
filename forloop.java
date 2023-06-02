import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a value");
        int n=input.nextInt();
        int i;

        for(i=0;i<=10;i++)
        {
            System.out.println(i + "*" + n + "=" + i*n);
        }
    }
}
