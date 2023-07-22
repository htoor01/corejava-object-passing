package com.object.passing;

    // You can pass objects as arguments through methods, but...
    // You must declare that method and set parameters to accept desired datatype.
    // In this case, a park method was created, and set parameter with 'Car'.

public class Main {

    public static void main(String[] args) {

        // Create instances of Garage and Car classes
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        // Specified cars can now be parked once calling method.
        garage.park(car1);
        garage.park(car2);

    }
}