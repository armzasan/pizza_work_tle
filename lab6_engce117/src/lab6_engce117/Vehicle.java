/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_engce117;

/**
 *
 * @author armar
 */
class Vehicle {
    private String make;
    private String model;
    private int year;
    
    public Vehicle(String make, String model, int year) {   //Constructor Method
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String make, String model) {
        this(make, model, 0); 
    }
    
    public Vehicle() {
        this("", "", 0); 
    }

    public void start() {
        System.out.println("Starting the vehicle...");
    }
    
    public void stop() {
        System.out.println("Stopping the vehicle...");
    }
    
    public void drive() {
        System.out.println("Driving the vehicle...");
    }
    
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return make.equals(other.make) && model.equals(other.model) && year == other.year;
        }
        return false;
    }
    
    public void printInfo() {
        System.out.println(make + " " + model + " " + year);
    }
    
    public void printInfo(String message) {
        System.out.println(message + " " + make + " " + model + " " + year);
    }
    
    public static void printInfo(Vehicle vehicle) {
        System.out.println(vehicle.make + " " + vehicle.model + " " + vehicle.year);
    }
}

