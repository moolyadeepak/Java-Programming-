import java.util.Scanner;

public class breakandcontinue {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input=new Scanner(System.in);
        int i;

        for(i=0;i<=10;i++)
        {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        }
    }

