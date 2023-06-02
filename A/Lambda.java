package A;

import java.util.Scanner;

@FunctionalInterface
interface example{
    void display(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();

        example e1 = (a,b)-> System.out.println(a+b);


        //        {
//            public void display(){
//
//                System.out.println("this is anonymous class");
//            }

//        };
       e1.display(x,y);

    }
}

//class ex implements example{
//
//    @Override
//    public void display() {
//
//    }
//}
