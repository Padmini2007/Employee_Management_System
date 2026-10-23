class Salary
{
    private static double basic_sal,bonus,tax,total_sal;
    public static String name;
    protected static int id;
       
    public static double Calculatesal()
    {
        total_sal = basic_sal + bonus - tax;
        return total_sal;
    }
    public static double Calculatesal(double basic,double b)
    {
        total_sal = basic + b;
        return total_sal;
    }
    public static void Calculatesal(double basic,double b,double t)
    {
        total_sal = basic + b - t;
    }
    public static void details(int i,String n)
    {
        name = n;
        id = i;
    }
    public static void display(){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("TOTAL SALARY:"+total_sal);
        
    }
}
public class Method
{
    public static void main(String [] args)
    {
        Salary.details(1, "Padmini J");
        Salary.Calculatesal(50000,10000,5000);
        Salary.display();
        Salary.details(2, "Kanishka M");
        Salary.Calculatesal(35000,15000);
        Salary.display();

    }
}