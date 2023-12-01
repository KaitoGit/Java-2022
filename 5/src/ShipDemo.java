public class ShipDemo {
        public static void main(String[] args) {
            Ship[] ships = new Ship[3];

            ships[0] = new Ship("Ship 1", "1990", 100);
            ships[1] = new CruiseShip("Cruise Ship 1", "2008", 200, 1000);
            ships[2] = new CargoShip("Cargo Ship 1", "2023", 400, 5000);

            for (Ship ship : ships) {
                System.out.println(ship.toString());
            }
        }
}
