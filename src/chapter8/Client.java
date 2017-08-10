package chapter8;

public class Client implements Callback {
    // Implements Callbacks interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implements interface" +
                            "may also define other members, too.");
    }
}
