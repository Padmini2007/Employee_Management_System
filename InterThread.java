class Employee {

    int salary = 0;
    String attendance = "Absent";
    String taskStatus = "Not Completed";

    synchronized void checkAttendance() {

        System.out.println("Manager is checking attendance...");

        if (attendance.equals("Absent")) {
            
            System.out.println("Employee is Absent");
            System.out.println("Waiting for employee to arrive...");

            try {
                wait();
            }
            catch(Exception e) {
            }
        }

        System.out.println("Employee is Present");
        System.out.println("Manager can assign the project");

        notify();
    }

    synchronized void employeeArrives() {

        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {
        }

        attendance = "Present";

        System.out.println("Employee arrived at the office");

        notify();
    }

    synchronized void assignProject() {

        try {
            wait();
        }
        catch(Exception e) {
        }

        if(attendance.equals("Present")) {

            System.out.println("Manager is assigning project...");
            System.out.println("Project assigned to Employee");

            notify();
        }
    }

    synchronized void checkStatus() {

        try {
            wait();
        }
        catch(Exception e) {
        }

        System.out.println("Employee is working on the project...");

        taskStatus = "Completed";

        if(taskStatus.equals("Completed")) {

            System.out.println("Project completed successfully");

            notify();
        }
        else {

            System.out.println("Project is not completed");
        }
    }

    synchronized void depositSalary(int amount) {

        try {
            wait();
        }
        catch(Exception e) {
        }

        if(taskStatus.equals("Completed")) {

            System.out.println("Going to deposit salary...");

            salary = amount;

            System.out.println("Salary deposited: " + salary);
        }
        else {

            System.out.println("Project is not completed");
            System.out.println("Salary cannot be deposited");
        }
    }
}


class InterThread {

    public static void main(String[] args) {

        Employee e = new Employee();

        new Thread() {

            public void run() {
                e.checkAttendance();
            }

        }.start();

        new Thread() {
            public void run() {
                e.employeeArrives();
            }
        }.start();

        new Thread() {

            public void run() {
                e.assignProject();
            }
        }.start();

        new Thread() {

            public void run() {
                e.checkStatus();
            }
        }.start();

        new Thread() {

            public void run() {
                e.depositSalary(30000);
            }

        }.start();
    }
}