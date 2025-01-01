package com.project.practice.array.service;

import com.project.practice.array.model.Passenger;

import java.util.Scanner;

public class PassengerService {
    int customerIndex = 0;
    private Passenger[] passengerList = new Passenger[2];
    private Scanner is = new Scanner(System.in);

    void displayPassengerDetails(Passenger passengers) {
        System.out.println(passengers);
    }
    public Passenger createNewPassenger(){
        Passenger passenger = new Passenger();
        System.out.println("Please Enter Passenger ID :");
        int passengerId = Integer.parseInt(is.nextLine());

        System.out.println("Enter your full Name:");
        String passengerName = is.nextLine();

        System.out.println("Enter your email:");
        String email = is.nextLine();

        System.out.println("Enter your Phone Number :");
        int phoneNumber = Integer.parseInt(is.nextLine());

        System.out.println("Enter your Address :");
        String passengerAddress = is.nextLine();

        passenger.setPassengerId(String.valueOf(passengerId));
        passenger.setPassengerName(passengerName);
        passenger.setEmail(email);
        passenger.setPhone(phoneNumber);
        passenger.setAddress(passengerAddress);

        return passenger;
    }

    public void showAllPassengers() {
        for (Passenger passenger : passengerList) {
            System.out.println("Passenger Information: " + passenger);
        }
    }
}


