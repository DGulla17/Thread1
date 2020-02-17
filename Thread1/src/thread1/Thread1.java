package thread1;

import java.util.Scanner;

public class Thread1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        T t = new T('a');
//        t.start();
//        T t2 = new T('b');
//        t2.start();
//        R r = new R('c');
//        Thread t3 = new Thread(r);
//        t3.start();
//        R r2 = new R('d');
//        Thread t4 = new Thread(r2);
//        t4.start();
//        Contatore cont = new Contatore();
//        RS rs = new RS("thread111", cont);
//        RS rs2 = new RS("thread222", cont);
        System.out.println("quanti soldi hai in the bank?");
        float saldo = in.nextFloat();
       // ContoCorrente cc = new ContoCorrente(saldo);
        ThreadBanca T = new ThreadBanca("cliente 1", saldo);
        while (true) {
            System.out.println(T.getNamee()+" ha "+T.getConto()+"$");
            System.out.println("prelievo -> 1\ndeposito -> 2");
            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("quanto vuoi prelevare?");
                    T.prelievo(in.nextFloat());
                    break;
                case 2:
                    System.out.println("quanto vuoi depositare?");
                    T.deposito(in.nextFloat());
                    break;
                default:
                    System.out.println("soca");
            }
        }
    }
}
