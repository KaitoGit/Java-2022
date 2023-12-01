public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;
    public CreditCard(Person newCardHolder,Money limit){
        owner = newCardHolder;
        creditLimit = limit;
        balance = new Money(0);
    }
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    public String getPersonals()
    {
        return owner.toString();
    }
    public void charge(Money amount)
    {
        if(amount.add(balance).compareTo(creditLimit)==-1)
        {
            balance=balance.add(amount);
        }
        else
        {
            System.err.println("Exceeds credit limit");
        }
    }
    public  void payment(Money amount)
    {
        balance = balance.subtract(amount);
    }

}
