import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int a= input.nextInt();
        int b=input.nextInt();
        int c= input.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else if(b>c){
                System.out.println("b is greater ");
            }
        }
        else{
            System.out.println("c is greater");
        }

    }
}
