import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();


        try {
           int c=  a/b;
            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("cannot be divided by zero");
//        }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("this will always execute");
        }
    }


    static void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("forced msg: cant divide by zero");
        } else {
            System.out.println(a / b);
        }
    }
}