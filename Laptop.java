// Q9: Laptop Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Laptop {

    // Instance variables
    String brand;
    int RAM;

    // Class (static) variable
    static String os = "Windows";

    // Method to display laptop details
    void displayDetails() {

        // Local variables
        String laptopBrand = brand;
        int laptopRAM = RAM;
        String operatingSystem = os;

        // Display laptop details
        System.out.println("Laptop Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + operatingSystem);
    }

    public static void main(String[] args) {

        // Creating an object of Laptop class
        Laptop laptop = new Laptop();

        // Local variables
        String selectedBrand = "HP";
        int selectedRAM = 8;

        // Assigning values to instance variables
        laptop.brand = selectedBrand;
        laptop.RAM = selectedRAM;

        // Calling the method
        laptop.displayDetails();
    }
}
