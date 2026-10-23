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
class Manager extends Salary
{
    float manager_allowance;
    float calculate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Manager Allowance:");
        manager_allowance=sc.nextFloat();
        total_sal=super.calculate()+manager_allowance;
        return total_sal;
    }
}
public class OverRiding
{
    public static void main(String[] args)
    {
        Manager m=new Manager();
        m.input();
        m.getinput();
        float employee_sal=m.base_sal+m.bonus-m.tax;
        m.calculate();
        
        System.out.println("===================================");
        System.out.println("         EMPLOYEE DETAILS     ");
        System.out.println("===================================");
        System.out.println("Id : "+m.id);
        System.out.println("Name : "+m.name);
        System.out.println("Age : "+m.age);
        System.out.println("Department : "+m.department);
        System.out.println("Job Role : "+m.job_role);
        System.out.println("Email Id : "+m.email_id);
        System.out.println("Mobile Number : "+m.mob_no);
        System.out.println("\n=======EMPLOYEE SALARY DETAILS=======");
        System.out.println("Total Salary: "+employee_sal);

        System.out.println("\n=====MANAGER SALARY DETAILS=====\n");
        System.out.println("Basic Salary : "+m.base_sal);
        System.out.println("Bonus : "+m.bonus);
        System.out.println("Tax : "+m.tax);
        System.out.println("Manager Allowance : "+m.manager_allowance);
        System.out.println("Total Salary : "+m.total_sal);
    }
}