// Q8: Pen Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Pen {

    // Instance variables
    String color;
    String type;

    // Class (static) variable
    static String manufacturer = "Cello";

    // Method to display pen details
    void displayDetails() {

        // Local variables
        String penColor = color;
        String penType = type;
        String penManufacturer = manufacturer;

        // Display pen details
        System.out.println("Pen Color: " + penColor);
        System.out.println("Pen Type: " + penType);
        System.out.println("Manufacturer: " + penManufacturer);
    }

    public static void main(String[] args) {

        // Creating an object of Pen class
        Pen pen = new Pen();

        // Local variables
        String selectedColor = "Blue";
        String selectedType = "Ballpoint";

        // Assigning local variables to instance variables
        pen.color = selectedColor;
        pen.type = selectedType;

        // Calling the method
        pen.displayDetails();
    }
}
