public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, float length, int cargoCapacity) {
        super(name, yearBuilt, length);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "The name of the ship : " + getName() + ", Cargo Capacity: " + getCargoCapacity() + " tons";
    }
}
