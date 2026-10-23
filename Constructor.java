class Employee {
    String name,department,job_role,mob_no,email,address;
    int age;

    Employee()
    {
        name="Null";
        age=0;
        department="Null";
        job_role="Null";
        mob_no="Null";
        email="Null";
        address="Null";
    }
    Employee(String name, int age, String department, String job_role, String mob_no, String email, String address) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.job_role = job_role;
        this.mob_no = mob_no;
        this.email = email;
        this.address = address;
    }

    void display() {
        System.out.println("\n========EMPLOYEE DETAILS========\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Job Role: " + job_role);
        System.out.println("Mobile Number: " + mob_no);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
public class Constructor {
    public static void main(String[] args) {

        Employee emp = new Employee("Padmini J", 19, "IT", "Software Engineer", "7598893728", "padhu@gmail.com", "4/11 Anna Nagar, Coimbatore");
        emp.display();
    }
}