package thread;

import org.junit.Test;

public class StaticClassTest {

    @Test
    public void test() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            try {
                StaticClass.callTetMethod("someToken", true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                StaticClass.callTetMethod("someanothertoken", true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(24000);

    }
}
