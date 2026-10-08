// Q2: Rectangle Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Rectangle {

    // Instance variables
    double length;
    double breadth;

    // Class (static) variable
    static String shapeName = "Rectangle";

    // Method to calculate and display the area
    void calculateArea() {

        // Local variable to store the calculated area
        double area = length * breadth;

        // Display rectangle details
        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {

        // Creating an object of Rectangle class
        Rectangle rectangle = new Rectangle();

        // Local variables
        double rectangleLength = 10.0;
        double rectangleBreadth = 5.0;

        // Assigning local variable values
        // to instance variables
        rectangle.length = rectangleLength;
        rectangle.breadth = rectangleBreadth;

        // Calling the method to calculate area
        rectangle.calculateArea();
    }
}
