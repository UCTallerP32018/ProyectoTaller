/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotaller;

import controlador.PersonasController;
import modelo.Persona;
import proyectotaller.datos.Datos;
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
        PersonasController pc = new PersonasController();
        Persona p = new Persona("juan", "5771552", 0);
        
        //Prueba de datos
        Datos.insertar(p);
        Persona p1 = (Persona)Datos.buscar(p);
        System.out.println(p1.getNombre()+" - "+p.getNombre());
        
        
    }
    
}
