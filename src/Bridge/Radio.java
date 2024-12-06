package Bridge;

public class Radio implements Device{
    private boolean onOff = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return onOff;
    }

    @Override
    public void disable() {
        onOff = !onOff;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = Math.max(0, Math.min(100, percent));
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("Radio - Power: " + (onOff ? "ON" : "OFF") + ", Volume: " + volume + ", Channel: " + channel);
    }
}
