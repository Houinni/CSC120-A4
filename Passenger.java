
public class Passenger {
    
    private String name;
    
    public Passenger(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void boardCar(Car c) {
        if (c.addPassenger(this)) {
            System.out.println(name + " has boarded the car.");
        } else {
            System.out.println(name + " could not board the car.");
        }
    }

    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println(name + " has gotten off the car.");
        } else {
            System.out.println(name + " is not on this car.");
        }
    }
}
