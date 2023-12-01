import java.util.Scanner;

public class retailItemDemo {


    public static void main(String[] args) throws negativeUnits, negativePrice {
        System.out.println("Hello welcome to your shop!");

        //Positive values
        RetailItem item1 = new RetailItem("Boxers",2,34.00);
        item1.setPrice(55);
        item1.setUnitsOnHand(6);
        System.out.println("Description: " + item1.getDescription()+ "\nUnits available: " +item1.getUnitsOnHand()+ "\nPrice: " + item1.getPrice());
        System.out.print("\n");

        // Negative (asks user to input items, this is where user can input negative values and get throw exception
        //scanner for user input
        Scanner input = new Scanner(System.in);
        RetailItem item2 = new RetailItem("Skirt",2,34.00);
        System.out.print("Input your own items and its prices along side the units available");

        //ask for item name
        System.out.print("\nItem Name: ");
        item2.setDescription(input.nextLine());

        //ask for item price
        System.out.print("Price: ");
        item2.setPrice(Double.parseDouble(input.nextLine()));

        //ask for item unit
        System.out.print("Units available: ");
        item2.setUnitsOnHand(Integer.parseInt(input.nextLine()));

        System.out.println("\nDescription: " + item2.getDescription()+ "\nUnits available: " +item2.getUnitsOnHand()+ "\nPrice: " + item2.getPrice());
    }



}
