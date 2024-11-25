package thread;

public class AnotherClass {

    private static AnotherClass anotherClass;

    public static AnotherClass getInstance(){
        if(anotherClass == null){
            anotherClass = new AnotherClass();
        }
        return anotherClass;
    }

    public void testAnotherMethod(String token) throws InterruptedException {
        System.out.println("testAnotherMethod" +  token);
        Thread.sleep(5000);
    }
}
