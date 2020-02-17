/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author gulla.davide
 */
public class ThreadBanca extends Thread{

    private String name;
    private float conto;

    public ThreadBanca(String name, float conto) {
        this.name = name;
        this.conto = conto;
    }

    void deposito(float soldi) {
        this.conto+=soldi;
    }

    void prelievo(float soldi) {
        this.conto-=soldi;
    }

    public float getConto() {
        return conto;
    }

    public String getNamee(){
        return name;
    }
}
