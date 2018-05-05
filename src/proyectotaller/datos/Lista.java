/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotaller.datos;

import modelo.Persona;



/**
 *
 * @author juan
 */
public class Lista {
    private Puntero listaPersonas;
    
    public Lista(){
        listaPersonas = new Puntero();
    }
    
    public void AgregarPersona(Persona p){
        
        Nodo nodoPersona = new Nodo();
        nodoPersona.setInfo(p);
        if(listaPersonas.getNodo()== null){
        listaPersonas.setNodo(nodoPersona);
        }else{
          Puntero ptr = new Puntero();
          ptr.setNodo(listaPersonas.getNodo());
          while (ptr.next()) {
            if(ptr.getNodo().getSgte().getNodo() == null){
                ptr.getNodo().getSgte().setNodo(nodoPersona);
                return;
            }
            ptr.setNodo(ptr.getNodo().getSgte().getNodo());
            
          }
        }
    }
        
        public void listar(){
        Puntero ptr = new Puntero();
        ptr.setNodo(listaPersonas.getNodo());
        while (ptr.next()) {
          System.out.println(ptr.getNodo().getInfo());
          ptr.setNodo(ptr.getNodo().getSgte().getNodo());
        }
          
            
        }
        
        
    }
    
    

