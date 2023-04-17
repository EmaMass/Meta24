/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.meta24;
import java.lang.String; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author poppe
 */
public class CalculadoraDeNumerosComplejos {
    private HashMap bancoDeEcuaciones;
    
    public CalculadoraDeNumerosComplejos(){
        bancoDeEcuaciones = new HashMap();
        bancoDeEcuaciones.put("Ecuacion1Real",0);
        bancoDeEcuaciones.put("Ecuacion1Imaginario",0);
        bancoDeEcuaciones.put("Ecuacion2Real",0);
        bancoDeEcuaciones.put("Ecuacion2Imaginario",0);
    }
    
    public CalculadoraDeNumerosComplejos(int real1, int imaginario1, int real2, int imaginario2){
        bancoDeEcuaciones = new HashMap();
        bancoDeEcuaciones.put("Ecuacion1Real",real1);
        bancoDeEcuaciones.put("Ecuacion1Imaginario",imaginario1);
        bancoDeEcuaciones.put("Ecuacion2Real",real2);
        bancoDeEcuaciones.put("Ecuacion2Imaginario", imaginario2);
    }
    
    public void ingresarDatos(int real1, int imaginario1, int real2, int imaginario2){
        bancoDeEcuaciones.replace("Ecuacion1Real",real1);
        bancoDeEcuaciones.replace("Ecuacion1Imaginario",imaginario1);
        bancoDeEcuaciones.replace("Ecuacion2Real",real2);
        bancoDeEcuaciones.replace("Ecuacion2Imaginario", imaginario2);
    }
    
    public void suma(){
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        valor1 = (int) bancoDeEcuaciones.get("Ecuacion1Real");
        valor2 = (int) bancoDeEcuaciones.get("Ecuacion1Imaginario");
        valor3 = (int) bancoDeEcuaciones.get("Ecuacion2Real");
        valor4 = (int) bancoDeEcuaciones.get("Ecuacion2Imaginario");
        int suma1 = valor1 + valor3;
        int suma2 = valor2 + valor4;
        System.out.println("La suma de: ("+valor1+" + "+valor2+"i) + ("+valor3+" + "+valor4+"i) = "+suma1+" + "+suma2+"i");
    }
    
    public void resta(){
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        valor1 = (int) bancoDeEcuaciones.get("Ecuacion1Real");
        valor2 = (int) bancoDeEcuaciones.get("Ecuacion1Imaginario");
        valor3 = (int) bancoDeEcuaciones.get("Ecuacion2Real");
        valor4 = (int) bancoDeEcuaciones.get("Ecuacion2Imaginario");
        int resta1 = valor1 - valor3;
        int resta2 = valor2 - valor4;
        System.out.println("La resta de: ("+valor1+" + "+valor2+"i) - ("+valor3+" + "+valor4+"i) = "+resta1+" + "+resta2+"i");
    }
    
    public void multiplicacion(){
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        valor1 = (int) bancoDeEcuaciones.get("Ecuacion1Real");
        valor2 = (int) bancoDeEcuaciones.get("Ecuacion1Imaginario");
        valor3 = (int) bancoDeEcuaciones.get("Ecuacion2Real");
        valor4 = (int) bancoDeEcuaciones.get("Ecuacion2Imaginario");
        int ac = valor1 * valor3;
        int bd = valor2 * valor4;
        int ad = valor1 * valor4;
        int bc = valor2 * valor3;
        int real = ac - bd;
        int imaginario = ad + bc;
        System.out.println("La multiplicacion de: ("+valor1+" + "+valor2+"i) * ("+valor3+" + "+valor4+"i) = ("+ac+" - "+bd+") + ("+ad+" + "+bc+")i = "+real+" + "+imaginario+"i");
    }
    
    public void division(){
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        valor1 = (int) bancoDeEcuaciones.get("Ecuacion1Real");
        valor2 = (int) bancoDeEcuaciones.get("Ecuacion1Imaginario");
        valor3 = (int) bancoDeEcuaciones.get("Ecuacion2Real");
        valor4 = (int) bancoDeEcuaciones.get("Ecuacion2Imaginario");
        int ac = valor1 * valor3;
        int bd = valor2 * valor4;
        int bc = valor2 * valor3;
        int ad = valor1 * valor4;
        int real = ac + bd;
        int imaginario = bc - ad;
        int divisor = (valor3 * valor3) + (valor4 * valor4);
        System.out.println("La division de: ("+valor1+" + "+valor2+"i) / ("+valor3+" + "+valor4+"i) = ("+ac+" + "+bd+") + ("+bc+" - "+ad+")i/("+valor3+"^2 + "+valor4+"^2) = ("+real+"/"+divisor+") + ("+imaginario+"/"+divisor+")i");
    }
}
