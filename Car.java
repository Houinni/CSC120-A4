import java.util.ArrayList;
/**
 * The {@code Car} class represents a car composed of an arraylist keeping track of passengers
 * and a number tracking the capacity of the car
 * It provides methods to access the passenger list, the capacity, and remaining seats
 * as well as adding & removing passengers from the car
 * finally a method that prints manifest
 */
public class Car {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;
/**
 * Constructs a car object with the specified maximum capacity.
 *
 * @param maxCapacity the maximum number of passengers the car can hold
 */
    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        this.passengers=new ArrayList<>();
    }
/**
 * Returns the maximum seating capacity of the car.
 *
 * @return the car's total capacity
 */
    public int getCapacity(){
        return maxCapacity;
    }
/**
 * Returns the number of available seats in the car.
 *
 * @return the number of seats remaining
 */
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }
/**
 * Adds a passenger to the car if there is available seating and the passenger 
 * is not already in the car.
 *
 * @param p the passenger to be added
 * @return {@code true} if the passenger was successfully added, 
 *         {@code false} otherwise
 */
    public boolean addPassenger(Passenger p){
        if(passengers.size()<maxCapacity){
            if(!passengers.contains(p)){
                passengers.add(p);
                return true;
            }
            return false; 
        }
        return false;
    }
/**
 * Removes a passenger from the car if the passenger is currently in the car.
 *
 * @param p the passenger to be removed
 * @return {@code true} if the passenger was successfully removed, 
 *         {@code false} otherwise
 */
    public boolean removePassenger(Passenger p){
        if(this.passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        return false; 
    }
/**
 * Prints the names of all passengers currently in the car.
 * If the car is empty, it prints a message indicating that the car is empty.
 */
    public void printManifest(){
        if(passengers.size()==0){
            System.out.println("This car is EMPTY.");
        }else {
            for (Passenger p:passengers){
                System.out.println(p.getName());
            }
        }
    }

    
}