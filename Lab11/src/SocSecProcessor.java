import java.util.Scanner;

public class SocSecProcessor {
    public static void main(String[] args)
    {
        String name, ssn;
        Scanner input = new Scanner(System.in);
        char repeat = 'y';
        while(repeat == 'y')
        {
            System.out.print("Name? ");// input name
            name = input.nextLine();
            System.out.print("SSN? ");// input ssn
            ssn = input.nextLine();
            try
            {
                boolean valid = isValid(ssn);
                if(valid)
                    System.out.println(name + " " + ssn + " " + "is valid");
            }
            catch (SocSecException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.print("Continue? ");
            repeat = input.nextLine().toLowerCase().charAt(0);
        }
    }
    /**
         Method to check validity of SSN
         @param ssn The ssn
         @return boolean
         @throws SocSecException throws the SocSecException
     */
    public static boolean isValid(String ssn) throws SocSecException //static method
    {
        int ssn_len = ssn.length();
        if(ssn_len != 11)
            throw new SocSecException("wrong number of characters");
        for(int i = 0; i < ssn_len; i++)
        {
            char ch = ssn.charAt(i);
            if( (i >= 0 && i <= 2) || i == 4 || i == 5 || (i >= 7 && i <= 10) )
            {
                if(!(ch >= '0' && ch <= '9'))
                {
                    throw new SocSecException("contains a character that is not a digit");
                }
            }
            else if(i == 3 || i == 6)
            {
                if(ch != '-')
                    throw new SocSecException("dashes at wrong positions");

            }
        }
        return true;
    }
}