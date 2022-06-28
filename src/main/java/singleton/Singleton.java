package singleton;

public class Singleton {
    private static volatile Singleton instance; // Must be volatile
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance; // Ensures the value of 'instance' will be the same when returning it
        if (result == null) { // Increase performance
            synchronized (Singleton.class) { // Must be executed one thread at the time
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
