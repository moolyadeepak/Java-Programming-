public class abstrac {
    public static void main(String[] args) {
        parent.Hey();
        child c1= new child();
        c1.ht();
    }
}
 abstract  class parent{
        static  void Hey(){
            System.out.println("Hello");
        }

        abstract  void ht();           //same as interface only writes questn
}


class child extends  parent{

    @Override
    void ht() {
        int a=2;
        int b=3;
        int c=a+b;

        System.out.println(c);

    }
}