/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.meta24;
import java.lang.String; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set; 
import java.util.Random;
import java.util.Iterator;
/**
 *
 * @author poppe
 */
public class Moneda {
    private Set<String> moneda;
    private ArrayList<String> lanzamientosAlmacenamiento;
    private Random rmd;
    public Moneda(){
        rmd = new Random();
        moneda = new HashSet<>();
        lanzamientosAlmacenamiento = new ArrayList<>();
        moneda.add("Cabeza");
        moneda.add("Cola");
    }
    
    public void lanzarMoneda(){
        int carasoCola = rmd.nextInt(2);
        Iterator<String> iteracion = moneda.iterator();
        if(carasoCola == 1){
            iteracion.next();
        }
        lanzamientosAlmacenamiento.add(iteracion.next());
        int temp = lanzamientosAlmacenamiento.size();
        System.out.println("La moneda cayo en: "+lanzamientosAlmacenamiento.get(temp-1));
    }
    
    public void leerAlmacenamiento(){
        int contador = 0;
        for(String carasVisibles : lanzamientosAlmacenamiento){
            contador += 1;
            System.out.println(contador+". "+carasVisibles);
        }
    }
}
