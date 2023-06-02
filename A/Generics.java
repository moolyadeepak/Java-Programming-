package A;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt();
        String  sub=in.next();
        student<Integer,String> s1 = new student();
        s1.info(marks,sub);

        float m = in.nextFloat();
        int s = in.nextInt();
        student<Float,Integer> s2 = new student();
        s2.info(m,s);

    }
}
class student <T,V>{
    T marks;
    V sub;

    public  void info(T marks, V sub){
        this.marks=marks;
        this.sub=sub;
        System.out.println(marks);
        System.out.println(sub);
    }


}
