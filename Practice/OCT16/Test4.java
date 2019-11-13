package Practice.OCT16;

class Television {
    int channel;
    int volume;
    boolean onOff;
}


public class Test4 {

    public static void main(String[] args) {
        Television tv = new Television();

        tv.channel = 10;
        tv.volume = 9;
        tv.onOff = true;

        System.out.println("채널: " + tv.channel);
        System.out.println("볼륨: " + tv.volume);
    }
}
