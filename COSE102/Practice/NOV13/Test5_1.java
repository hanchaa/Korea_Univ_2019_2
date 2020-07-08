package Practice.NOV13;

public class Test5_1 implements Test5_2, Test5_3 {
    public void sendCall() {
        System.out.println("Send Call");
    }

    public void receiveCall() {
        System.out.println("Receive Call");
    }

    public void recognizeSpeech() {
        System.out.println("Recognize Speech");
    }

    public void synthesizeSpeech() {
        System.out.println("Synthesize Speech");
    }

    public int touch() {
        return 1;
    }

    public static void main(String[] args) {
        Test5_1 a = new Test5_1();

        a.printLogo();
        a.sendCall();
        a.receiveCall();
        a.receiveCall();
        a.synthesizeSpeech();
        System.out.println(a.touch());
        System.out.println("Timeout = " + a.TIMEOUT);
    }
}
