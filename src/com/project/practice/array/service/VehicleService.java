package com.project.practice.array.service;

import com.project.practice.array.model.Vehicle;

import java.util.Scanner;

public class VehicleService {
    int vehicleIndex= 0;
    private Vehicle[] vehicleList = new Vehicle[2];
    private Scanner is = new Scanner(System.in);

    void displayVehicleDetails(Vehicle vehicle){
        System.out.println(vehicle);
    }
    public Vehicle createNewVehicle() {
        Vehicle vehicle = new Vehicle();

        System.out.println("Please Enter Vehicle ID :");
        String vehicleId = is.nextLine();

        System.out.println("Enter the Vehicle Model:");
        String vehicleModel = is.nextLine();

        System.out.println("Enter the Vehicle Registration Number:");
        String registrationNumber = is.nextLine();

        System.out.println("Enter the Vehicle Color:");
        String vehicleColor = is.nextLine();

        System.out.println("Is the vehicle available? (true/false):");
        boolean availability = Boolean.parseBoolean(is.nextLine());

        System.out.println("Enter the Vehicle Seat Capacity:");
        int seatCapacity = Integer.parseInt(is.nextLine());

        System.out.println("Enter the Vehicle's Per KM Rate:");
        double perKmRate = Double.parseDouble(is.nextLine());

        vehicle.setVehicleId(vehicleId);
        vehicle.setModel(vehicleModel);
        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setColor(vehicleColor);
        vehicle.setAvailable(availability);
        vehicle.setSeatCapacity(seatCapacity);
        vehicle.setPerKmRate(perKmRate);

        return vehicle;
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Vehicle Information: " + vehicle);
        }
    }
}
