import java.util.*;
class Employee
{
    int id,age;
    String name,gender,department,job_role,mob_no,email,address;
    double salary;
    
    void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Gender:");
        gender=sc.nextLine();
        System.out.println("Enter Department:");
        department=sc.nextLine();
        System.out.println("Enter Job Role:");
        job_role=sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mob_no=sc.nextLine();
        System.out.println("Enter Email:");
        email=sc.nextLine();
        System.out.println("Enter Address:");
        address=sc.nextLine();
        System.out.println("Enter Salary:");
        salary=sc.nextDouble();
        sc.nextLine(); // Consume the newline character left by nextDouble()
    }
    
    void display()
    {
        System.out.println("\n========EMPLOYEE DETAILS========\n");
        System.out.println("id:"+id);
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("GENDER:"+gender);
        System.out.println("DEPARTMENT:"+department);
        System.out.println("JOB ROLE:"+job_role);
        System.out.println("MOBILE NUMBER:"+mob_no);
        System.out.println("EMAIL ID:"+email);
        System.out.println("ADDRESS:"+address);
        System.out.println("SALARY:"+salary);
    }
}

public class Input
{
    public static void main(String[] args)
    {
        Employee emp=new Employee();
        emp.getinput();
        emp.display();
        
    }
}