public class Super {
    public static void main(String[] args) {
        There h1= new There();
        h1.dis();
    }
}

class Hey{


    void dis(){
        System.out.println("this is parents method");
    }
}

class There extends Hey{

    void dis(){


        System.out.println("this is child method");
        super.dis();
    }
}

