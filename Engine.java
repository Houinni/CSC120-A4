/**
 * the {@code Engine} class represents an engine composed of fuel type, current and maximum fuel level
 * It provides method to access fuel type, current and maximum fuel level, to refuel and decrease fuel 
 */
public class Engine {

    private FuelType fuelType;
    private double fuelLevel;
    private double Maximun;

     /**
     * Constructs a new {@code Engine} 
     *
     * @param fuelType          the type of fuel used by the engine
     * @param Maximum           the fuel capacity of the engine
     * @param fuelLevel         the current fuel level of the engine
     */
    public Engine(FuelType fuelType, double Maximun){
        this.fuelType=fuelType;
        this.Maximun=Maximun;
        this.fuelLevel=this.Maximun;
        
    }

    /**
     * @return the fuel type of the engine
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * @return the current fuel level of the engine
     */
    public double getCurrentFuelLevel() {
        return fuelLevel;
    }

    /**
     * @return the maximum fuel level of the engine
     */
    public double getMaxFuelLevel() {
        return Maximun;
    }

    /**
     * set current fuel level to maximum level
     */
    private void refuel(){
        this.fuelLevel=Maximun;
    }

    /**
     * Decrease current fuel level
     * @return the remaining fuel level of the engine
     */
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