

public class negativeUnits extends  Exception{

    public negativeUnits(double amount){
        super("The units " + amount + " of the item cannot be a negative");
    }
}
