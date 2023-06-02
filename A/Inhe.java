package A;

public class  Inhe {
    public static void main(String[] args) {
        stud s1 = new stud();
        s1.name();
        s1.uniname();
    }
}
class stud implements College{

    @Override
    public void name() {
        System.out.println("this is from college");
    }

    @Override
    public void uniname() {
        System.out.println("this is from university");
    }
}


