// Q4: Employee Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Employee {

    // Instance variables
    int empId;
    double salary;

    // Class (static) variable
    static String companyName = "ABC Technologies";

    // Method to display employee details
    void displayDetails() {

        // Local variables
        int employeeId = empId;
        double employeeSalary = salary;
        String employeeCompany = companyName;

        // Display employee details
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Company Name: " + employeeCompany);
    }

    public static void main(String[] args) {

        // Creating an object of Employee class
        Employee employee = new Employee();

        // Local variables
        int id = 101;
        double employeeSalary = 45000.0;

        // Assigning local variables to instance variables
        employee.empId = id;
        employee.salary = employeeSalary;

        // Calling the method
        employee.displayDetails();
    }
}
