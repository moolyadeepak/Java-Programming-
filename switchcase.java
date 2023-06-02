import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Value");
        String hey;
        hey = input.next();
        switch(hey){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Its a vowels");
                break;
           default:
           System.out.println("Not Vowels");

        }
    }
}
