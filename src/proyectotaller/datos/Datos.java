/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotaller.datos;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author juan
 */
public class Datos {
    private static ArrayList<Object> data = new ArrayList<>();
    
    public static void insertar(Object registro){
        Datos.data.add(registro);
    }
    public static Object eliminar(Object registro){
        Datos.data.remove(registro);
        return registro;
    }
    
    public static Object buscar(Object registro){
        data.stream().filter((dato) -> (registro == dato));
        return registro;
    }
    
    
}