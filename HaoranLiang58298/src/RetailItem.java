public class RetailItem {
    private String description;//The description field references a String object that holds a brief description of the item.
    private int unitsOnHand;//The unitsOnHand field is an int variable that holds the number of units currently in inventory.
    private double price;//The price field is a double that holds the item’s retail price.

    public RetailItem(String d, int u, double p) throws exception, anotherException {
        setDescription(d);
        setUnitsOnHand(u);
        setPrice(p);
    }
    public void setDescription(String d) {
        this.description = d;
    }
    public void setUnitsOnHand(int u) throws anotherException{
        if (u < 0) {
            throw new anotherException(u);
        }
        this.unitsOnHand = u;
    }
    public void setPrice(double p) throws exception {
        if (p < 0) {
            throw new exception(p);
        }
        this.price = p;
    }
    public String getDescription() {
        return description;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    public double getPrice() {
        return price;
    }
}
