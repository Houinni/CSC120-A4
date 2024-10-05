import java.util.ArrayList;
/**
 * The {@code Train} class represents a train composed of an engine and a list of cars.
 * It provides methods to access the engine and cars, calculate capacities, and print passenger manifests.
 */
public class Train {
    // Private attributes
    private Engine engine;
    private ArrayList<Car> train;

    /**
     * Constructs a new {@code Train} with the specified engine properties and number of cars.
     *
     * @param fuelType          the type of fuel used by the engine
     * @param fuelCapacity      the fuel capacity of the engine
     * @param nCars             the number of cars in the train
     * @param passengerCapacity the passenger capacity of each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        // Initialize the engine
        this.engine=new Engine(fuelType, fuelCapacity);

        // Initialize the list of cars
        this.train=new ArrayList<>();

        // Add the specified number of cars to the train
        for(int i=0;i<nCars;i++){
            train.add(new Car(passengerCapacity));
        }
    }
    /**
     * 
     * Returns the engine of the train.
     * @return the engine object
     */
    public Engine getEngine() {
        return engine;
    }
    /**
     * 
     * Returns the car at the specified index.
     *
     * @param i the index of the car to retrieve
     * @return the {@code Car} object at the given index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Car getCar(int i) {
        if (i>=0 && i<train.size()) {
            return train.get(i);
        } 
        else {
            throw new IndexOutOfBoundsException("Invalid car index");
        }
    }
    /**
     * 
     * @return the total passenger capacity of all cars
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : train) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }
    /**
     * 
     * @return the total number of available seats
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : train) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    /**
     * Prints the passenger manifest for each car that has passengers.
     */
    public void printManifest() {
        
        int carNumber = 1;

        for (Car car : train) {
            if (car.seatsRemaining() < car.getCapacity()) {
                System.out.println("Passengers in Car " + carNumber + ":");
                car.printManifest();
            }
            carNumber++;
        }

    }


}