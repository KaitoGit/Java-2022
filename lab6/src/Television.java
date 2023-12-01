//The purpose of this class is to model a television
//your name and today's date Haoran Liang 2022/11/15

public class Television {
    //private final String MANUFACTURER;
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int volume;
    private int channel;

    public Television(String manufacturer, int screenSize) {
        this.MANUFACTURER = manufacturer;
        this.SCREEN_SIZE = screenSize;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    /**
     The setChannel method sets the channel.
     @param channel The channel.
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }
    /**
     The power method sets the power.
     */
    public void power() {
        powerOn = !powerOn;
    }
    /**
     The increaseVolume method increase the Volume.
     */
    public void increaseVolume() {
        volume+= 1; // increase the volume by 1
    }
    /**
     The decreaseVolume method decrease the Volume.
     */
    public void decreaseVolume() {
        volume-= 1; // decrease the volume by 1
    }
    /**
     The getChannel method returns Channel.
     @return The Channel.
     */
    public int getChannel() {
        return channel;
    }
    /**
     The getVolume method returns Volume.
     @return The Volume.
     */
    public int getVolume() {
        return volume;
    }
    /**
     The getManufacturer method returns Manufacturer.
     @return The Manufacturer.
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }
    /**
     The getScreenSize method returns screenSize.
     @return The screenSize.
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }
}
