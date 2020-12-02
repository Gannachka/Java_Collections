package main.java;

public class Plane implements Comparable {
    private String name;
    private int maxFlightDistance;
    private final int fuelConsumption;
    private final int maxLoadCapacity;
    private final int passengersCapacity;



    public Plane(String name, int maxFlightDistance, int fuelConsumption, int maxLoadCapacity, int passengersCapacity) {
        this.name = name;
        this.maxFlightDistance = maxFlightDistance;
        this.fuelConsumption = fuelConsumption;
        this.maxLoadCapacity = maxLoadCapacity;
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public int compareTo(Object plane) {
        plane = (Plane)plane;
        int compareMaxFlightDistance=((Plane)plane).maxFlightDistance;
        return this.maxFlightDistance-compareMaxFlightDistance;

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }
    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }


    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }


    public int getPassengersCapacity() {
        return passengersCapacity;
    }


    @Override
    public String toString() {

        return name + ",  Max Flight Distance: " + maxFlightDistance + ", Fuel Consumption: " + fuelConsumption +
                ", Lifting Capacity: " + maxLoadCapacity + ", Passengers Capacity: " + passengersCapacity;
    }
}
