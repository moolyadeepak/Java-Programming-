package A;


import java.util.Scanner;

public class inh1 {
    public static void main(String[] args) {
        emp s1 =new emp();

       s1.info();
        s1.org();

    }
}
class emp implements company,organization{


    @Override

    public void info() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter info");

        String  a =in.nextLine();
        int b=in.nextInt();

        System.out.println("The name of company:"+a);
        System.out.println("The Recent Rank in world:"+b);
    }
//    void info(int a)      //polymorphism


    @Override
    public void org() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter org name");
        String  c =in.nextLine();


        System.out.println("The organization name is:" +c);


    }
}
