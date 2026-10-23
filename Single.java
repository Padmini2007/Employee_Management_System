import java.util.*;
class Employee
{
    String name,department,job_role,mob_no,email_id;
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
        System.out.println("Enter Department:");
        department=sc.nextLine();
        System.out.println("Enter Job Role:");
        job_role=sc.nextLine();
        System.out.println("Enter Email id:");
        email_id=sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mob_no=sc.nextLine();
    }
    
}
class Salary extends Employee
{
    float base_sal,bonus,tax,total_sal;
    
    void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary:");
        base_sal=sc.nextFloat();
        System.out.println("Enter Bonus:");
        bonus=sc.nextFloat();
        System.out.println("Enter Tax:");
        tax=sc.nextFloat();
        
    }
     
    float calculate()
    {
        total_sal=base_sal+bonus-tax;
        return total_sal;
    }
}
public class Single
{
    public static void main(String[] args)
    {
        Salary s=new Salary();
        s.input();
        s.getinput();
        s.calculate();
        
        System.out.println("===================================");
        System.out.println("         EMPLOYEE DETAILS           ");
        System.out.println("===================================");
        System.out.println("Id : "+s.id);
        System.out.println("Name : "+s.name);
        System.out.println("Age : "+s.age);
        System.out.println("Department : "+s.department);
        System.out.println("Job Role : "+s.job_role);
        System.out.println("Salary: "+s.total_sal);
        System.out.println("Email Id : "+s.email_id);
        System.out.println("Mobile Number : "+s.mob_no);
    }
}