import java.util.*;

class Person
{
    String name, dob, blood_grp, department, mob_no, email_address;
    int age;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Age:");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Date Of Birth:");
        dob = sc.nextLine();

        System.out.println("Enter Blood Group:");
        blood_grp = sc.nextLine();

        System.out.println("Enter Department:");
        department = sc.nextLine();

        System.out.println("Enter Mobile Number:");
        mob_no = sc.nextLine();

        System.out.println("Enter Email:");
        email_address = sc.nextLine();
    }
}

class Employee extends Person
{
    String job_roll;
    int id;

    void getinput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Job Roll :");
        job_roll = sc.nextLine();
        System.out.println("Enter ID :");
        id = sc.nextInt();
    }
}

class Salary extends Employee
{
    float bas_sal, tax, bonus, total_sal;

    void calculatesal(float basic, float b, float t)
    {
        bas_sal = basic;
        bonus = b;
        tax = t;
        total_sal = bas_sal + bonus - tax;
    }

    void display()
    {
        System.out.println("===================================");
        System.out.println("         EMPLOYEE DETAILS           ");
        System.out.println("===================================");
        System.out.println("ID : " + id);
        System.out.println("Name : " +name);
        System.out.println("Age : " + age);
        System.out.println("Date Of Birth : " + dob);
        System.out.println("Blood Group : " + blood_grp);
        System.out.println("Department : " + department);
        System.out.println("Job Roll : " + job_roll);
        System.out.println("Salary : " + total_sal);
        System.out.println("Mobile Number : " + mob_no);
        System.out.println("Email ID : " + email_address);
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Salary s = new Salary();
        s.input();
        s.getinput();
        s.calculatesal(50000, 5000, 2500);
        s.display();
    }
}