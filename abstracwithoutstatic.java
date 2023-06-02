import java.util.Scanner;

public class abstracwithoutstatic {
    public static void main(String[] args) {
        son o1 = new son();
        o1.ht();
    }
}

      abstract class P1 {
        abstract void ht();
        void add(){
            int a=4;
            int b=9;
            System.out.println(a+b);
        }

    }

      class son extends P1 {
        void ht() {
            String name="mumbai";
            String add;

            Scanner in = new Scanner(System.in);
           // name = in.nextLine();
            System.out.println("My hometown is "+name);


            System.out.println("This is my hometown");

        }
    }




