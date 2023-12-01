public class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, float length, int maxPassengers) {
        super(name, yearBuilt, length);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "The name of the ship : " + getName() + ", Max Passengers: " + getMaxPassengers();
    }
}
