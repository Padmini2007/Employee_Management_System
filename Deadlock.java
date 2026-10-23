class Employee {

    Object salaryLock = new Object();
    Object projectLock = new Object();

    void processSalary() {

        synchronized (salaryLock) {

            
            System.out.println("Salary Thread: Got Salary lock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Salary Thread: Waiting for project lock");

            synchronized (projectLock) {
                System.out.println("Salary Thread: Got Project lock");
            }
        }
    }

    void assignProject() {

        synchronized (projectLock) {

            System.out.println("Project Thread: Got Project lock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Project Thread: Waiting for salary lock");

            synchronized (salaryLock) {
                System.out.println("Project Thread: Got Salary lock");
            }
        }
    }
}

public class Deadlock {

    public static void main(String[] args) {

        Employee emp = new Employee();

        Thread salaryThread = new Thread() {
            public void run() {
                emp.processSalary();
            }
        };

        Thread projectThread = new Thread() {
            public void run() {
                emp.assignProject();
            }
        };

        salaryThread.start();
        projectThread.start();
    }
}