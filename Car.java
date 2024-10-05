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
     * 
     * @param maxCapacity constructor of car
     */
    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        passengers=new ArrayList<>();
    }
    /**
     * 
     * @return the car's capacity
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * 
     * @return remaining seats
     */
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }
    /**
     * 
     * take in @param p
     * @return true or false for whether a passenger is successfully added
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
     * 
     * take in @param p
     * @return true or false for whether a passenger is successfully removed
     */
    public boolean removePassenger(Passenger p){
        if(this.passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        return false; 
    }

    /**
     * print all passengers in the car
     */
    public void printManifest(){
        if(passengers.size()==0){
            System.out.println("This car is EMPTY.");
        }
        else {
            
            for (Passenger p:passengers){
                System.out.println(p.getName());
            }
        }
    }

    
}