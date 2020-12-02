package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Aircompany {
    private ArrayList<Plane> planes;
    public Aircompany(){
        planes=new ArrayList<Plane>();
    }
    public Aircompany(ArrayList<Plane> planes){
        this.planes=planes;
    }
    public int TotalCapacity(){
        return planes.stream().mapToInt(Plane::getPassengersCapacity).sum();
    }
    public int СarryingСapacity(){
        return planes.stream().mapToInt(Plane::getMaxLoadCapacity).sum();
    }
    public List<Plane> SortByMaxSpeed() {
        return planes.stream().sorted(Comparator.comparingInt(Plane::getMaxFlightDistance)).collect(Collectors.toList());
    }
    public void printIfFuelConsumptionInInterval(int from, int to){
        printIf(new Predicate<Plane>() {
            @Override
            public boolean test(Plane plane) {
                if(plane.getFuelConsumption() >= from && plane.getFuelConsumption() <= to)
                    return true;
                return false;
            }
        });
    }
    public void printIf(Predicate<Plane> predicate){
        for(int i = 0; i < planes.size(); i++){
            if(predicate.test(planes.get(i))){
                System.out.println(planes.get(i).toString());
            }
        }
    }
}
