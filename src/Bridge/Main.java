package Bridge;

class Main {
    public static void main(String[] args) {
        Device radio = new Radio();
        Device tv = new Tv();
        Remote losersRemote = new BasicRemote(radio);
        Remote jeremysRemote = new AdvancedRemote(tv);

        losersRemote.power();
        losersRemote.volumeDown();
        losersRemote.channelUp();
        losersRemote.channelUp();
        losersRemote.power();

        jeremysRemote.power();
        jeremysRemote.volumeUp();
        jeremysRemote.channelDown();
        ((AdvancedRemote) jeremysRemote).mute();

        radio.printStatus();
        tv.printStatus();
    }
}