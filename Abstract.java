import java.util.*;
abstract class Employee
{
    String name,Job_role,email_id,mob_no;
    int id,age;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id:");
        id=sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Name :");
        name=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Job Role:");
        Job_role=sc.nextLine();
        System.out.println("Enter Email id:");
        email_id=sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mob_no=sc.nextLine();
    }
    void info(){
        System.out.println("===================================");
        System.out.println("         TEAM MEMBERS           ");
        System.out.println("===================================");
        System.out.println("        EMPLOYEE DETAILS           ");


    }
    abstract void inputTeamDetails();
    abstract void display();
}
class Manager extends Employee
{
    String project_name,project_duration;

    void inputTeamDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Project Name:");
        project_name=sc.nextLine();
        System.out.println("Enter Project Duration:");
        project_duration=sc.nextLine();
        
    }
    void display()
    {
        System.out.println("===================================\n");

        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Job Role : "+Job_role);
        System.out.println("Email Id : "+email_id);
        System.out.println("Mobile Number : "+mob_no);
       
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        Employee e=new Manager();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Team Size:");
        n=sc.nextInt();
        sc.nextLine();
        e.inputTeamDetails();

        Manager[] m=new Manager[n];
        for(int i=0;i<n;i++)
        {
            m[i]=new Manager();
            m[i].input();
        }
        e.info();
        for(int i=0;i<n;i++){
            m[i].display();
        }
    }
}