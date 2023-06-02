package A;

public class Interface {
    public static void main(String[] args) {
        imple a= new imple();
        a.add();
    }
}

class imple implements New{

    @Override
    public void add() {
        int a= 34;
        int b=90;
        int c=a+b;
        System.out.println(c);
    }
}