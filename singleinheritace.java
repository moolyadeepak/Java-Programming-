public class singleinheritace {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printdata();
    }
}

class College{ //parent class
    int cid=5784;
    String cname="Coep";
}

class Student extends College{
    void printdata(){
        System.out.println("Id of college is" +cid);
        System.out.println("Name of college is: "+cname);
    }
}
