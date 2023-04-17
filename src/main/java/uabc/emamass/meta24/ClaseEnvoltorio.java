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
public class ClaseEnvoltorio {
    private Random rmd;
    private ArrayList<Integer> nums;
    private ArrayList<Integer> repetido;
    private int contador;
    
    public ClaseEnvoltorio(){
        rmd = new Random();
        nums = new ArrayList<>();
        repetido = new ArrayList<>();
    }
    
    public void iniciar(){
        for(int i = 0; i < 10; i++){
            nums.add(rmd.nextInt(12));
        }
    }
    
    public void repetidos(){
        for(int i = 0; i < 10; i++){
            if(!(repetido.contains(nums.get(i)))){
                for(int j = 0; j < 10; j++){
                    if(nums.get(i) == nums.get(j)){
                        contador += 1;
                    }
                }
                repetido.add(nums.get(i));
                System.out.println("El numero "+nums.get(i)+" se repite "+contador+" veces");
            }
            contador = 0;
        }
    }
    
    public void imprimirLista(){
        System.out.println(nums);
    }
}
