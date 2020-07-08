package Practice.NOV13;

public interface Test5_3 {
    public static final int TIMEOUT = 100000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}
