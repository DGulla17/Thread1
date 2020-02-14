package thread1;

public class Thread1 {

    public static void main(String[] args) {
        T t = new T('c');
        t.start();
        T t2 = new T('d');
        t2.start();
    }
}
