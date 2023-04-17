package uabc.emamass.meta24;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
Codigo utilizado de la practica 4 de laboratorio, con sus clases acompañantes
Tiene de base codigo del repositorio https://github.com/molguinuabc/lpoopractica3/tree/cardshark
con modificaciones para realizar la practica 4, y la modificacion del metodo extra para realizar 
lo pedido en esta meta. 
*/
public class Baraja {
  private ArrayList<Carta> mazo;
  private Random rmd;
  public Baraja() {
    this.rmd = new Random();
    this.mazo = new ArrayList<>();
    inicializa();
  }

  private void inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 1 ; v <= 13 ; v++) {
        try {
          mazo.add(new Carta(v,f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public void barajar() {
    Collections.shuffle(mazo);
  }

  public ArrayList<Carta> repartir(int n) {
    ArrayList<Carta> mano = new ArrayList<>();
    for(int i=1; i<=n; i++) {
      mano.add(mazo.remove(0));
    }
    return mano;
  }
  
  public Carta agregarCarta(){
      return mazo.remove(0);
  }
  
  public void quitarCarta(Carta carta){
      mazo.add(carta);
  }
  
  public Carta cartaAleatoria(){
      return mazo.remove(rmd.nextInt(mazo.size()));
  }

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }


}
