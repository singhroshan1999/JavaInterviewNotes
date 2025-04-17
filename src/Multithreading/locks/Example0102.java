package Multithreading.locks;

/**
 * SOLUTION : Use `synchronized block`
 *
 * This example demonstrate how `synchronized method` blocks entire object/class
 * creating temporary deadlock like situation
 * Here only one thread can access method1/method2 of class A
 */
public class Example0102 {
    static class A{

        private final Object obj1 = new Object();
        private final Object obj2 = new Object();
        void method1() throws InterruptedException {
            synchronized (obj1){
                System.out.println("method1:Sleep-start");
                Thread.sleep(10000);
                System.out.println("method1:Sleep-end");
            }
        }

        void method2() throws InterruptedException {
            synchronized (this) {
                System.out.println("method2:Sleep-start");
                Thread.sleep(10000);
                System.out.println("method2:Sleep-end");
            }
        }
    }

    public static void main(String[] args) {
        boolean flag = false;
        A a = new A();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.method1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.method2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
