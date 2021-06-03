package com.github.bsferreira.solid.srp.violation;
package com.digite.kata

public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    @Test
    public void testVehicleWithPositiveNum()
    {
        final int w_no = 10;
        Vehicle w_vehicle = new Vehicle(w_no);
        assertEquals(w_vehicle.maxFuel, 10);
        assertEquals(w_vehicle.remainingFuel, 10);
    }
    
    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
    /*
    public void accelerate() {
        remainingFuel--;
    }*/
}
