class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        if (year < 1886 || year > 2100) { 
            throw new IllegalArgumentException("Year must be between 1886 and 2100");
        }
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2100) {
            throw new IllegalArgumentException("Year must be between 1886 and 2100");
        }
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); 
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String make, String model) {
        super(make, model, 2025); 
        this.numberOfDoors = 4;   
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
    }
}
public class TestRentalService {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Toyota", "Camry", 2021);
        System.out.println("Vehicle: " + myVehicle.getMake() + " " + myVehicle.getModel() + " " + myVehicle.getYear());

        Car myCar = new Car("Honda", "Civic", 2022, 4);
        System.out.println("Car: " + myCar.getMake() + " " + myCar.getModel() + " " + myCar.getYear() + ", Doors: " + myCar.getNumberOfDoors());

        Car defaultCar = new Car("Ford", "Mustang");
        System.out.println("Default Car: " + defaultCar.getMake() + " " + defaultCar.getModel() + " " + defaultCar.getYear() + ", Doors: " + defaultCar.getNumberOfDoors());
    }
}