/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotaller.datos;

/**
 *
 * @author juan
 */
public class Puntero {
    private Nodo nodo;

    public Puntero() {
        this.nodo = null;
    }

    public Puntero(Nodo nodo) {
        this.nodo = nodo;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public boolean next(){
        return (nodo != null?true:false);
    }
    
    
}
