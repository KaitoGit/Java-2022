public class anotherException extends Exception{
    public anotherException(double n) {
        super("This Negative number can't be used for units : " + n);//that can be instantiated and thrown when a negative number is given for the units on hand.
    }
}
