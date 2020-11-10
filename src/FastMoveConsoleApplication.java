/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
import base.Bike;
import base.Location;
import base.Parcel;
import base.Parcel;
import base.ParcelStatus;

public class FastMoveConsoleApplication {

    String menu = "1.Add Bike"
            + "/n2.Add Person"
            + "/n3.Add Parcel "
            + "/n4.EXIT";

    public Bike addBike(String licensePlate, int engineCapacity) {
        return new Bike(licensePlate, engineCapacity);
    }
    
    public Location addParcel (double weight, ParcelStatus status, Location location){
        return new Parcel(weight,ParcelStatus.DELIVERED,Location);
    }
    
    public
    
    public void Menu(){
        
    
}

}
