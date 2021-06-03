package com.digite.kata;

public class VehicleOperations
{
    public void accelerate(Vehicle a_vehicle) {
        int w_rem = a_vehicle.getRemainingFuel();
        a_vehicle.setRemainingFuel(w_rem--);
    }
}
