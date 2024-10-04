import java.util.ArrayList;

public class Car {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity){
        this.maxCapacity=maxCapacity;
        passengers=new ArrayList<>();
    }

    public int getCapacity(){
        return maxCapacity;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }

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

    public boolean removePassenger(Passenger p){
        if(this.passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        return false; 
    }
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

    public static void main(String[] args) {
        // Create Car objects with different capacities
        Car car1 = new Car(2); // Car with capacity for 2 passengers
        Car car2 = new Car(3); // Car with capacity for 3 passengers

        // Create Passenger objects
        Passenger passenger1 = new Passenger("Alice");
        Passenger passenger2 = new Passenger("Bob");
        Passenger passenger3 = new Passenger("Charlie");
        Passenger passenger4 = new Passenger("Diana");

        // Test adding passengers to car1
        System.out.println("Adding passengers to car1:");
        System.out.println("Add Alice to car1: " + car1.addPassenger(passenger1)); // Should return true
        System.out.println("Add Bob to car1: " + car1.addPassenger(passenger2));   // Should return true
        System.out.println("Add Charlie to car1: " + car1.addPassenger(passenger3)); // Should return false (car1 is full)

        // Test adding passengers to car2
        System.out.println("\nAdding passengers to car2:");
        System.out.println("Add Charlie to car2: " + car2.addPassenger(passenger3)); // Should return true
        System.out.println("Add Diana to car2: " + car2.addPassenger(passenger4));   // Should return true

        // Print manifests
        System.out.println("\nCar1 Manifest:");
        car1.printManifest();

        System.out.println("\nCar2 Manifest:");
        car2.printManifest();

        // Test removing a passenger
        System.out.println("\nRemoving Bob from car1:");
        System.out.println("Remove Bob from car1: " + car1.removePassenger(passenger2)); // Should return true

        // Print updated manifest for car1
        System.out.println("\nUpdated Car1 Manifest:");
        car1.printManifest();

        // Check seats remaining
        System.out.println("\nSeats remaining in car1: " + car1.seatsRemaining()); // Should be 1
        System.out.println("Seats remaining in car2: " + car2.seatsRemaining()); 
    }
}