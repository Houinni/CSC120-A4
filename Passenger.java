/**
 * The Passenger class represents a passenger with a name who can board and 
 * get off a car. The passenger interacts with the Car class to add or remove
 * themselves from a list of passengers in the car.
 * 
 * This class provides methods to retrieve the passenger's name, 
 * board a car, and get off a car, with appropriate feedback based on the success 
 * of the operations.
 */
public class Passenger {
    
    private String name;
/**
 * Constructs a Passenger object with the specified name.
 *
 * @param name the name of the passenger
 */
    public Passenger(String name) {
        this.name = name;
    }
/**
 * Retrieves the name of the passenger.
 *
 * @return the name of the passenger
 */
    public String getName(){
        return this.name;
    }
/**
 * Attempts to board the specified car. 
 * Prints a message indicating whether boarding was successful.
 *
 * @param c the car to board
 */
    public void boardCar(Car c) {
        if (c.addPassenger(this)) {
            System.out.println(name + " has boarded the car.");
        } else {
            System.out.println(name + " could not board the car.");
        }
    }
/**
 * Attempts to get off the specified car.
 * Prints a message indicating whether getting off was successful.
 *
 * @param c the car to get off
 */
    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println(name + " has gotten off the car.");
        } else {
            System.out.println(name + " is not on this car.");
        }
    }
}
