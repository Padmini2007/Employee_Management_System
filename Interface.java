import java.util.*;
interface Employee
{
    void input();
    void display();
}
interface Attendance
{
    void attendance();
}
interface Project
{
    void inputTeamDetails();
}
class Manager implements Employee,Attendance,Project
{
    String name,job_role,email_id,mob_no,project_name,project_duration,status;
    int id,age;

    Scanner sc=new Scanner(System.in);


    public void inputTeamDetails()
    {
        System.out.println("Enter Project Name:");
        project_name=sc.nextLine();
        System.out.println("Enter Project Duration:");
        project_duration=sc.nextLine();
        
    }
    public void projectDisplay()
    {
        System.out.println("===================================");
        System.out.println("         PROJECT DETAILS           ");
        System.out.println("===================================");
        System.out.println("Project Name : "+project_name);
        System.out.println("Project Duration : "+project_duration);
    }
    public void input()

    {
        System.out.println("Enter Id:");
        id=sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Name :");
        name=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Job Role:");
        job_role=sc.nextLine();
        System.out.println("Enter Email id:");
        email_id=sc.nextLine();
        System.out.println("Enter Mobile Number:");
        mob_no=sc.nextLine();
    }
    public void attendance()
    {
        System.out.println("Enter Attendance(Present/Absent): ");
        status=sc.next();

        if(status.equals("Present"))
        {
            status="Present";
        }
        else if(status.equals("Absent"))
        {
            status="Absent";
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    public void display()
    {
        System.out.println("\n===================================");
        System.out.println("         EMPLOYEE DETAILS           ");
        System.out.println("===================================");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Job Role : "+job_role);
        System.out.println("Email Id : "+email_id);
        System.out.println("Mobile Number : "+mob_no);
        
        System.out.println("\n======== ATTENDANCE DETAILS ======== ");

        System.out.println("Attendance Status : "+status);
    }

}
public class Interface
{
    public static void main(String args[])
    {
        Manager project=new Manager();
        project.inputTeamDetails();


        Manager[] m=new Manager[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Team Size:");
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++)
        {
            m[i]=new Manager();
            m[i].input();
            m[i].attendance();
        }

        project.projectDisplay();

        for(int i=0;i<n;i++)
        {
            m[i].display();
        }
    }
}