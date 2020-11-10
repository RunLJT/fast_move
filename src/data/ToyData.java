package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import javax.tools.DocumentationTool;
import jdk.javadoc.doclet.Taglet;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[1] = new Bike("Click", 150);
        bikes[2] = new Bike("Wave", 120);
        bikes[3] = new Bike("Bike3", 130);
        // your code
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person("Run", "Lert");
        person[1] = new Person("Bas", "pra");
        person[2] = new Person("Sin", "suk");

        // your code
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(50.0, ParcelStatus.READY_TO_SHIP, new Location(1, 0));
        parcels[1] = new Parcel(60.0, ParcelStatus.READY_TO_SHIP, new Location(2, 1));
        parcels[2] = new Parcel(70.0, ParcelStatus.READY_TO_SHIP, new Location(3, 2));
        parcels[3] = new Parcel(80.0, ParcelStatus.READY_TO_SHIP, new Location(4, 3));
        parcels[4] = new Parcel(90.0, ParcelStatus.READY_TO_SHIP, new Location(5, 4));
        parcels[5] = new Parcel(110.0, ParcelStatus.READY_TO_SHIP, new Location(6, 5));
        parcels[6] = new Parcel(120.0, ParcelStatus.READY_TO_SHIP, new Location(7, 6));
        parcels[7] = new Parcel(150.0, ParcelStatus.READY_TO_SHIP, new Location(8, 7));
        parcels[8] = new Parcel(45.0, ParcelStatus.READY_TO_SHIP, new Location(9, 8));
        parcels[9] = new Parcel(40.0, ParcelStatus.READY_TO_SHIP, new Location(10, 9));
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
