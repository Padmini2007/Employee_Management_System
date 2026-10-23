import java.util.*;
class Employee
{
    int id,age;
    String name,gender,department,job_role;
    double salary,bonus;

}
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}
class InvalidSalaryException extends Exception
{
    InvalidSalaryException(String message)
    {
        super(message);
    }
}
class InvalidBonusException extends Exception
{
    InvalidBonusException(String message)
    {
        super(message);
    }
}
class Error
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        try
        {
            System.out.println("Enter ID:");
            emp.id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            emp.name=sc.nextLine();
            System.out.println("Enter Age:");
            emp.age=sc.nextInt();
            if(emp.age<18 || emp.age>60)
            {
                throw new InvalidAgeException("Invalid Age: Age must be between 18 and 60");
            }
            sc.nextLine();
            System.out.println("Enter Gender:");
            emp.gender=sc.nextLine();
            System.out.println("Enter Department:");
            emp.department=sc.nextLine();
            System.out.println("Enter Job Role:");
            emp.job_role=sc.nextLine();
            System.out.println("Enter Salary:");
            emp.salary=sc.nextDouble();
            if(emp.salary<0)
            {
                throw new InvalidSalaryException("Invalid Salary: Salary must be a positive value");
            }
            System.out.println("Enter Bonus:");
            emp.bonus=sc.nextDouble();
            if(emp.bonus<0 || emp.bonus>emp.salary*0.2)
            {
                throw new InvalidBonusException("Invalid Bonus: Bonus must be between 0 and 20% of the salary");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidBonusException e)
        {
            System.out.println(e.getMessage());
        }
    }
}