import java.util.*;
class Employee extends Thread
{
    public void run()
    {
        System.out.println("Employee attendance checked");
        System.out.println("Employee is completing assigned work");
        System.out.println("Employee work status updated");
        System.out.println("Employee daily report submitted");
    }
}
class Process{
    public static void main(String[] args)
    {
        System.out.println("Welcome to WIPRO ITech Solutions");

        Employee e= new Employee();
        e.start();

        System.out.println("Employee activities completed");
    }
}
