public class superclass {
    public static void main(String[] args) {
     //  stud1 s1=new stud1();
        stud2 s2=new stud2();

       //s1.cid();
   s2.cid();
    }
}
class clg{
//  private String clgname;

    void cid(){
        System.out.println("Your name is:Ajinkya");
        System.out.println("Your cid is:697");


    }


}
class stud1 extends clg {
    //    String clgname;


    @Override
    void cid() {
        System.out.println("Your name is:Deepak");
        System.out.println("your cid is:3165");
        super.cid();

    }
}

   class stud2 extends clg {
        int cid;

        @Override
        void cid() {

            System.out.println("your name is:Krishna");
            System.out.println("your cid is:9784");


        }
    }

//    void run(){
//      //  super.cid();
//
//    }
