public class exception extends Exception{
    public exception(double n) {
        super("This Negative number can't be used for price : " + n);//The exception class that can be instantiated and thrown when a negative number is given for the price.
    }
}
