class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    protected int batteryCapacity;
    protected int chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable, int batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("GJ01AB1234", "Toyota", "Petrol");
        v.displayDetails();
        System.out.println();

        Car c = new Car("GJ05CD5678", "Honda", "Diesel", 5, true);
        c.displayDetails();
        System.out.println();

        ElectricCar ec = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 2);
        ec.displayDetails();
        System.out.println();

        Vehicle v2 = new Car("GJ06GH3456", "Hyundai", "Petrol", 5, true);
        v2.displayDetails();
        System.out.println();

        if (v2 instanceof Car) {
            Car carObj = (Car) v2;
            System.out.println("Downcasting successful. Seats: " + carObj.numberOfSeats);
        }

        if (ec instanceof ElectricCar) {
            System.out.println("ec is instance of ElectricCar");
        }
    }
}