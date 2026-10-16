class DemoObject {
    DemoObject() {
        System.out.println("Object constructed.");
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() {
        System.out.println("Garbage collector is cleaning up this object.");
    }
}

public class LifecycleDemo {
    public static void main(String[] args) {
        DemoObject obj = new DemoObject();
        obj = null;
        System.gc();
        System.out.println("GC requested. End of main.");
    }
}
