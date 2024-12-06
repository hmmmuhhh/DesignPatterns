package Bridge;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        d.setVolume(0);
    }
}
