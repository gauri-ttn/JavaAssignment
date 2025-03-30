interface Vehicle {
    void manufacture();
}

class Car implements Vehicle {
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}

class Bike implements Vehicle {
    public void manufacture() {
        System.out.println("Bike is being manufactured.");
    }
}

class Truck implements Vehicle {
    public void manufacture() {
        System.out.println("Truck is being manufactured.");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("CAR");
        vehicle1.manufacture();

        Vehicle vehicle2 = VehicleFactory.getVehicle("BIKE");
        vehicle2.manufacture();

        Vehicle vehicle3 = VehicleFactory.getVehicle("TRUCK");
        vehicle3.manufacture();
    }
}
