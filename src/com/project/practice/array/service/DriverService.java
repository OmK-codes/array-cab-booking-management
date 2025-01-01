package com.project.practice.array.service;

import com.project.practice.array.model.Driver;

import java.util.Scanner;

public class DriverService {
    int DriverIndex = 0;
    private Driver[] driverList = new Driver[2];
    private Scanner is = new Scanner(System.in);

    void displayDriver(Driver driver){
        System.out.println(driver);
    }
    public Driver createNewDriver() {
        Driver driver = new Driver();

        System.out.println("Please Enter Driver ID :");
        String driverId = is.nextLine();

        System.out.println("Enter the Driver Name:");
        String driverName = is.nextLine();

        System.out.println("Enter the Driver Phone Number:");
        String phone = is.nextLine();

        System.out.println("Enter the Driver License Number:");
        String licenseNumber = is.nextLine();

        System.out.println("Enter the Total Trips Completed by Driver:");
        int totalTrips = Integer.parseInt(is.nextLine());

        System.out.println("Is the Driver Online? (true/false):");
        boolean onlineStatus = Boolean.parseBoolean(is.nextLine());

        driver.setDriverId(driverId);
        driver.setDriverName(driverName);
        driver.setPhone(phone);
        driver.setLicenseNumber(licenseNumber);
        driver.setTotalTrips(totalTrips);
        driver.setOnlineStatus(onlineStatus);

        return driver;
    }

    public void showAllDrivers() {
        for (Driver driver : driverList) {
            System.out.println("Driver Information: " + driver);
        }
    }
}
