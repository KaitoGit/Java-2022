public class SocSecException extends Exception {

    public SocSecException() //the superclass constructor
    {
        super();
    }

    public SocSecException(String message)
    {
        super("Invalid social security number, " + message);
    }

}
