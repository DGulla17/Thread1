package thread1;

public class RS implements Runnable {

    Thread T;
    String threadName;
    Contatore cont;

    public RS(String threadName, Contatore cont) {
        this.threadName = threadName;
        this.cont = cont;
        T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {
        System.out.println("starting " + threadName);
        //synchronized(cont){
        cont.stampaContatore();
        //}
        System.out.println("Thread " + threadName + " exiting.");
    }

}
