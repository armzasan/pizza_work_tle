/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_engce117;

/**
 *
 * @author armar
 */
public class car extends Vehicle {

    public car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car...");
    }
    public void drive() {
        System.out.println("Driving the vehicle...");
    }

    public void drift() {
        System.out.println("Drifting the car...");
    }
}

