/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Persona {
    private int id;
    private String nombre;
    private String ci;
    ArrayList<Vehiculo> vehiculos;
    
    /**
     * -500.00000.0000.000000000000.0000000 - Carlos
     * 0 - persona externa
     * 1 - estudiante 
     * 2 - personales varios
     * 3 - profesores
     * 4 - personales administrativos
     * 5 - Autoridades
     * 6 - caso especial
     **/
     private int prioridad;
    //foto

    public Persona() {
    }
    
    public Persona(String nombre, String ci, int prioridad) {
        this.nombre = nombre;
        this.ci = ci;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public int getId(){
        return id;
    }
    
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    public void eliminarVehiculo(int idx){
        vehiculos.remove(idx);
    }
    
    public void listarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);            
        }
    }
}
