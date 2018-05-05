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
public class Nodo {
    private Object info;
    private Puntero sgte;
    
    public Nodo(){
        this.info = null;
        this.sgte = new Puntero();
    }

    public Nodo(Object info, Puntero sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Puntero getSgte() {
        return sgte;
    }

    public void setSgte(Nodo Puntero) {
        this.sgte = sgte;
    }
    
    public boolean next(){
        return (sgte.getNodo() != null?true:false);
    }
    
    
}
