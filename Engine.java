
public class Engine {

    private FuelType fuelType;
    private double fuelLevel;
    private double Maximun=1000;

    public Engine(FuelType fuelType, double fuelLevel){
        this.fuelType=fuelType;
        this.fuelLevel=fuelLevel;
        
    }
    public FuelType getFuelType() {
        return fuelType;
    }

    public double getCurrentFuelLevel() {
        return fuelLevel;
    }

    public double getMaxFuelLevel() {
        return Maximun;
    }

    public void refuel(){
        this.fuelLevel=Maximun;
    }

    public boolean go(){
        this.fuelLevel-=1;
        if(this.fuelLevel>0){
            System.out.println("remaining fuel level: "+ this.fuelLevel);
            return true;
        }
        else{
            System.out.println("remaining fuel level: "+ this.fuelLevel);
            return false;
        }
    }


    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    
}