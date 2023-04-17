/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.meta24;
import java.lang.String; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author poppe
 */
public class Dado {
    private ArrayList<Integer> dados;
    private Random rmd;
    private int ladoDado;
    public Dado(){
        dados = new ArrayList<>();
        rmd = new Random();
        ladoDado = 0;
    }
    
    public int girarDado6lados(){
        ladoDado = rmd.nextInt(6)+1;
        return ladoDado;
    }
    
    public int girarDado12lados(){
        ladoDado = rmd.nextInt(12)+1;
        return ladoDado; 
    }
    
    public void almacenarDados(int dado){
        dados.add(dado);
        System.out.println("Dado guardado");
        if(dados.size() >= 6){
            System.out.println("Mas de 5 dados guardados, borrando el dato mas viejo: "+dados.get(0));
            dados.remove(0);
        }
    }
    
    public void regresarDado(int index){
        System.out.println("El dado guardado en el espacio "+index+" tiene valor de "+dados.get(index-1));
    }
    
}
