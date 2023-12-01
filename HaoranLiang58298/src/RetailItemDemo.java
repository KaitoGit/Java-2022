import java.util.Scanner;

public class RetailItemDemo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String description;
        int units;
        double price;
        RetailItem r1;

        System.out.println("__________________________________");
        System.out.println("Welcome to your retail store!");
        System.out.println("__________________________________");
        System.out.println("Please Enter the description : ");
        description = sc.nextLine();
        System.out.println("Enter the units on hand (Only numbers can be entered): ");
        units = sc.nextInt();
        while (units < 0) {
            try {
                    throw new anotherException(units);
            } catch (anotherException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter the units on hand : ");
            units = sc.nextInt();
        }

        System.out.println("Enter the price (Only numbers can be entered): ");
        price = sc.nextDouble();

        while (price < 0) {
            try {
                    throw new exception(price);
            } catch (exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter the price : ");
            price = sc.nextDouble();
        }

        r1 = new RetailItem(description, units, price);

        System.out.println("__________________________________");
        System.out.println("Description\tUnits on Hand\tPrice\t");
        System.out.println("__________________________________");
        System.out.println("Item 1\t" + r1.getDescription() + "\t\t" + r1.getUnitsOnHand() + " \t\t\t" + r1.getPrice());
        System.out.println("__________________________________");


        System.exit(0);
    }
}
