package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<Plane>();
        planes.add(new Plane("Boeing-737", 900, 12000, 60500, 164));
        planes.add(new Plane("Boeing-737-800", 940, 12300, 63870, 192));
        planes.add(new Plane("Boeing-747", 980, 16100, 70500, 242));
        planes.add(new Plane("Airbus A320", 930, 11800, 65500, 188));
        planes.add(new Plane("Airbus A330", 990, 14800, 80500, 222));
        planes.add(new Plane("Embraer 190", 870, 8100, 30800, 64));
        planes.add(new Plane("Sukhoi Superjet 100", 870, 11500, 50500, 140));
        planes.add(new Plane("Bombardier CS300", 920, 11000, 60700, 196));

        Aircompany aircompany = new Aircompany(planes);

        System.out.println(aircompany.TotalCapacity());

        System.out.println(aircompany.СarryingСapacity());

        System.out.println(aircompany.SortByMaxSpeed());

        aircompany.printIfFuelConsumptionInInterval(12000,13000);


    }
}
