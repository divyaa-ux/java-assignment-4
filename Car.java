// Q6: Car Class
// Demonstrates instance variables, class variable,
// local variables and methods

class Car {

    // Instance variables
    String brand;
    double mileage;

    // Class (static) variable
    static int wheels = 4;

    // Method to display car details
    void displayDetails() {

        // Local variables
        String carBrand = brand;
        double carMileage = mileage;
        int carWheels = wheels;

        // Display car details
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Number of Wheels: " + carWheels);
    }

    public static void main(String[] args) {

        // Creating an object of Car class
        Car car = new Car();

        // Local variables
        String carBrand = "Toyota";
        double carMileage = 18.5;

        // Assigning local variables to instance variables
        car.brand = carBrand;
        car.mileage = carMileage;

        // Calling the method
        car.displayDetails();
    }
}
