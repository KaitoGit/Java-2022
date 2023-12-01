public class Ship {
    private String name;
    private String year;
    private float length;
    public Ship(String name, String year,float length)
    {
        this.name = name;
        this.year = year;
        this.length = length;
    }
// get methods
    public String getName()
    {
        return name;
    }
    public String getYear()
    {
        return year;
    }
    public float getLength(){
        return length;
    }
    @Override
    public String toString()
    {
        return "The name of the ship : " + getName() +
                ", The year that the ship was built : " + getYear()+
                ", The length of the ship in meters : " + getLength()+" meters";
    }
}
