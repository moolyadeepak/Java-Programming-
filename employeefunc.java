import java.util.Scanner;

public class employeefunc {
    Scanner in=new Scanner(System.in);

    String n;
    int i;
    double s;
    public void display(String n,int i,double s) {



        double HRA=s*10/100;
        double DA= s*97/100;
        double PF= s*12/100;
        double ewf=s*0.1/100;

        double gross_salary=s+DA+HRA;
        double net_salary=gross_salary-PF-ewf;




        System.out.println("ID:" +i);
        System.out.println("Name:" +n);
        System.out.println("Salary:" +s);
        System.out.println("HRA is: "+HRA);
        System.out.println("your gross sal is "+gross_salary);
        System.out.println("your net salary is "+net_salary);

    }

    public static void main(String[] args) {
        employeefunc obj1= new employeefunc();
        employeefunc obj2= new employeefunc();
        employeefunc obj3= new employeefunc();


        obj1.display("Deepak",1,10000);
        obj2.display("Krishna",2,15000);
        obj1.display("Ajinkya",3,20000);



    }

}
