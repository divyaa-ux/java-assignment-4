// Q3: Circle Class
// Demonstrates instance variable, class variable,
// local variables and methods

class Circle {

    // Instance variable
    double radius;

    // Class (static) variable
    static double PI = 3.14;

    // Method to calculate and display area
    void calculateArea() {

        // Local variable to store area
        double area = PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate and display circumference
    void calculateCircumference() {

        // Local variable to store circumference
        double circumference = 2 * PI * radius;

        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {

        // Creating an object of Circle class
        Circle circle = new Circle();

        // Local variable
        double circleRadius = 7.0;

        // Assigning local variable value
        // to instance variable
        circle.radius = circleRadius;

        // Calling methods
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
