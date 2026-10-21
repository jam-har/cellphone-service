package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner customer = new Scanner(System.in);

        CellPhone user1 = new CellPhone();
        //What is the serial number? 2597153
        //What model is the phone? iPhone 15 Pro Max
        //Who is the carrier? Verizon
        //What is the phone number? 888-555-1234
        //Who is the owner of the phone? Sandra
        System.out.println("What is the serial number?");
        int serialNumber = customer.nextInt();
        customer.nextLine();
        System.out.println("What model is the phone?");
        String model = customer.nextLine();
        System.out.println("Who is the carrier?");
        String carrier = customer.nextLine();
        System.out.println("What is the phone number?");
        String phoneNumber = customer.nextLine();
        System.out.println("Who is the owner of the phone?");
        String owner = customer.nextLine();

        user1.setSerialNumber(serialNumber);
        user1.setCarrier(carrier);
        user1.setModel(model);
        user1.setPhoneNumber(phoneNumber);
        user1.setOwner(owner);

        System.out.println(user1.getSerialNumber());
        System.out.println(user1.getModel());
        System.out.println(user1.getCarrier());
        System.out.println(user1.getPhoneNumber());
        System.out.println(user1.getOwner());






    }
}
