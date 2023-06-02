public class Myclass {
    public static void main(String[] args) {
      Emp Ritu = new Emp();
      Ritu.display("Ritu",7,45000);
    }
}
class Emp{
    int i;
    String n;
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
}
