public class object {
    String name;
    int rno;
    double marks;

    public void display(String n,int r,double m) {
        System.out.println();
        System.out.println("Name:" +n);
        System.out.println("Roll no:" +r);
        System.out.println("Marks:" +m);

    }

    public static void main(String[] args) {
        object obj1=new object();
        object obj2=new object();
        object obj3=new object();
        obj1.display("Deepak",46,35.01);
        obj1.display("Ajinkya",86,95.01);
        obj1.display("Krishna",96,93.01);



    }
}
