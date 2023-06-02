public class polymorphism {
    public static void main(String[] args) {
        Area s1=new Area();
        s1.area(23,3);

    }
}

class Area{

    void area(int l, int b){
        int a;
        a=l*b;
        System.out.println(a);
    }

    void area(int z){

        int y=3;
        z=y*y*y;
        System.out.println(z);

    }


}
