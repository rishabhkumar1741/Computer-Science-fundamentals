class counter {
    synchronized void printTable(int n) {// method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
class 

class MyThread1 extends Thread {
    counter t;

    MyThread1(counter t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class MyThread2 extends Thread {
    counter t;

    MyThread2(counter t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        counter obj = new counter();// only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

    }
}
