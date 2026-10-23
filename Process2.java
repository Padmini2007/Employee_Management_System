import java.util.*;

class Employee implements Runnable
{
    public void run()
    {
        System.out.println("Employee attendance checked");
        System.out.println("Employee is completing assigned work");
        System.out.println("Employee work status updated");
        System.out.println("Employee daily report submitted");
    }
}

class Process2
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to WIPRO ITech Solutions");

        Employee e = new Employee();
        Thread t = new Thread(e);
        t.start();

        System.out.println("Employee activities completed");
    }
}