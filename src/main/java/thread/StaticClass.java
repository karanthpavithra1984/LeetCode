package thread;

public class StaticClass {

    public static void callTetMethod(String token, boolean callAnotherMethod) throws InterruptedException {
        testMethod(token, callAnotherMethod);
    }

    public static synchronized void testMethod(String token, boolean callAnotherMethod) throws InterruptedException {
        System.out.println("Before anotherMethod  -> " + token);
        Object lock = new Object();
        synchronized (lock) {
            AnotherClass.getInstance().testAnotherMethod(token);
            System.out.println("locking something -> " + token);
        }
        if (callAnotherMethod) {
            System.out.println("Calling another method -> " + token);
            AnotherClass.getInstance().testAnotherMethod(token);
        }

        System.out.println("After calling -> " + token);
    }
}
