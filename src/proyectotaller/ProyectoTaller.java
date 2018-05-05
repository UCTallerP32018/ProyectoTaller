/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotaller;

import controlador.PersonasController;
import modelo.Persona;
import proyectotaller.datos.Lista;
import proyectotaller.datos.Nodo;
import proyectotaller.datos.Puntero;
import vista.jFPersonas;

/**
 *
 * @author juan
 */
public class ProyectoTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Lista lp = new Lista();
        lp.AgregarPersona(new Persona("Carlos", "500180", 0));
        lp.AgregarPersona(new Persona("Pepito", "500181", 0));
        lp.listar();
        
        /*System.out.println(ptr.getNodo().getInfo());
        ptr.setNodo(ptr.getNodo().getSgte().getNodo());
        System.out.println(ptr.getNodo().getInfo());*/
        
        
    }
    
}
