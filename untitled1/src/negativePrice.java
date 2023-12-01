

public class negativePrice extends Exception{

    public negativePrice(double amount){
        super("The price " + amount + " cannot be a negative");
    }

}
