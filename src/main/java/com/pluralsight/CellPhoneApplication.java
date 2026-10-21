package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner customer = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        //What is the serial number? 2597153
        //What model is the phone? iPhone 15 Pro Max
        //Who is the carrier? Verizon
        //What is the phone number? 888-555-1234
        //Who is the owner of the phone? Sandra
        System.out.println("Cell Phone 1");
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

        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setModel(model);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        System.out.println(cellPhone1.getSerialNumber());
        System.out.println(cellPhone1.getModel());
        System.out.println(cellPhone1.getCarrier());
        System.out.println(cellPhone1.getPhoneNumber());
        System.out.println(cellPhone1.getOwner());

        System.out.println("Cell Phone 2");
        System.out.println("What is the serial number?");
        serialNumber = customer.nextInt();
        customer.nextLine();
        System.out.println("What model is the phone?");
        model = customer.nextLine();
        System.out.println("Who is the carrier?");
        carrier = customer.nextLine();
        System.out.println("What is the phone number?");
        phoneNumber = customer.nextLine();
        System.out.println("Who is the owner of the phone?");
        owner = customer.nextLine();

        cellPhone2.setSerialNumber(serialNumber);
        cellPhone2.setCarrier(carrier);
        cellPhone2.setModel(model);
        cellPhone2.setPhoneNumber(phoneNumber);
        cellPhone2.setOwner(owner);

        display(cellPhone1);
        display(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

    }
    public static void display(CellPhone phone) {
        System.out.println(phone.getSerialNumber()+ "\n" + phone.getOwner() + "\n" + phone.getPhoneNumber());



    }
}
