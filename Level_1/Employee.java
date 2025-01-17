import java.util.Scanner;

class EmployeeDetails {
    // Data members
    private String name;
    private int id;
    private float salary;

    // Constructor
    public EmployeeDetails(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);   
        System.out.println("Employee salary: " + salary);   
    }
}

class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        String name = sc.next();
        System.out.println("Enter Employee id:");
        int id = sc.nextInt();
        System.out.println("Enter Employee salary:");
        float salary = sc.nextFloat();

        // Create object
        EmployeeDetails emp = new EmployeeDetails(name, id, salary);
        emp.display();
    }
}
