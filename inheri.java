import java.util.Scanner;

public class inheri {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("1.Programmer \n2.Manager \n3.HR \n");
        System.out.println("Enter your choice");
        int n=in.nextInt();

        switch (n){
            case 1:
                Pro s1=new Pro();
                s1.paysal();
                s1.getdata();
                s1.putdata();
                break;
            case 2:
                Manager s2=new Manager();
                s2.paysal();
                s2.getdata();
                s2.putdata();
                break;
            case 3:
                HR s3=new HR();
                s3.paysal();
                s3.getdata();
                s3.putdata();
                break;

        }

    }
}
class em {
    private int ne;
    double sal;
    String name;
   Scanner in=new Scanner(System.in);

    void getdata() {
        System.out.println("Enter your name:");
        name=in.nextLine();
        System.out.println("Enter your salary:");
        sal=in.nextDouble();

    }
    void putdata() {
        System.out.println(" name is:"+ name);
        System.out.println(" salary is:"+ sal);
    }
    void paysal(){
        double HRA=sal*10/100;
        double DA= sal*97/100;
        double PF= sal*12/100;
        double ewf=sal*0.1/100;

        double gross_salary=sal+DA+HRA;
        double net_salary=gross_salary-PF-ewf;
        System.out.println("Your salary:"+ net_salary);
    }

}
class Pro extends em{
    void pro(String name,int sal, int ne){
        this.name=name;
        this.sal=sal;

    }
}
class Manager extends em{
    void mang(String name,int sal){
        this.name=name;
        this.sal=sal;
    }
}
class HR extends em{
    void hr(String name,int sal){
        this.name=name;
        this.sal=sal;
    }
}


