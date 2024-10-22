package Exo19;

public class Singleton {
    private static volatile Singleton instance;

    private int accessCount;

    private final long creationTime;

    private Singleton() {
        System.out.println("Singleton instance created.");
        this.accessCount = 0;
        this.creationTime = System.currentTimeMillis();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        instance.incrementAccessCount();
        return instance;
    }

    private void incrementAccessCount() {
        accessCount++;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public long getUptime() {
        return System.currentTimeMillis() - creationTime;
    }

    public static void reset() {
        synchronized (Singleton.class) {
            instance = null;
        }
    }

    public static boolean isInstantiated() {
        return instance != null;
    }

    public static void main(String[] args) {
        System.out.println("Getting first instance...");
        Singleton instance1 = Singleton.getInstance();

        System.out.println("\nGetting second instance...");
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        }

        System.out.println("\nAccess count: " + instance1.getAccessCount());
        System.out.println("Uptime (ms): " + instance1.getUptime());

        Singleton.reset();
        System.out.println("\nAfter reset, is instantiated? " + Singleton.isInstantiated());
    }
}