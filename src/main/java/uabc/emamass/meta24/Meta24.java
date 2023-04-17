/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.meta24;
/*
 *
 * @author Emanuel Seiji Massuda Cuevas 
 */
public class Meta24 { 
    public static void main(String[] args) {
       ClaseEnvoltorio ce = new ClaseEnvoltorio();
       System.out.println("Clase Envoltorio: ");
       ce.iniciar();
       ce.repetidos();
       ce.imprimirLista();
       Dado dd = new Dado();
       System.out.println("Dados");
       int dado = dd.girarDado12lados();
       System.out.println("Dado de 12 lados salio: "+dado);
       dd.almacenarDados(dado);
       dado = dd.girarDado6lados();
       System.out.println("Dado de 6 lados salio: "+dado);
       dd.almacenarDados(dado);
       dd.regresarDado(1);
       CalculadoraDeNumerosComplejos calc = new CalculadoraDeNumerosComplejos(3,2,4,5);
       System.out.println("Calculadora de Numeros Complejos");
       calc.suma();
       calc.resta();
       calc.multiplicacion();
       calc.division();
       Baraja mano = new Baraja();
       System.out.println("Baraja");
       Carta cartaaleatoria = mano.cartaAleatoria();
       System.out.println("Carta aleatoria de baraja: "+cartaaleatoria);
       Moneda mon = new Moneda();
       System.out.println("Moneda");
       mon.lanzarMoneda();
       mon.lanzarMoneda();
       mon.lanzarMoneda();
       mon.leerAlmacenamiento();
    }
}
