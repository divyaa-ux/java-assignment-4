// Q1: Create a Student class
// Demonstrates instance variables, class variable and local variables

class Student {

    // Instance variables
    String name;
    int age;

    // Class (static) variable
    static int count = 0;

    // Method to display student details
    void displayDetails() {

        // Local variables
        String studentName = name;
        int studentAge = age;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }

    public static void main(String[] args) {

        // Creating the first Student object
        Student student1 = new Student();

        // Local variables
        String name1 = "Divya";
        int age1 = 21;

        // Assigning values to instance variables
        student1.name = name1;
        student1.age = age1;

        // Increasing class variable count
        count++;

        // Creating the second Student object
        Student student2 = new Student();

        String name2 = "Rahul";
        int age2 = 22;

        student2.name = name2;
        student2.age = age2;

        count++;

        // Displaying first student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println();

        // Displaying second student details
        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println();

        // Displaying total number of students
        System.out.println("Total Number of Students: " + count);
    }
}
