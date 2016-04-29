package boletin29;

import java.util.ArrayList;

/**
 *
 * @author ?
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList <Barco> lista = new ArrayList();
       Barco yate1 = new Yate (2,200,5,50,"QWER59");
       Barco velero1 = new Velero (1,7,60,"QIEIRD23");
       Barco deportiva1 = new Deportiva (250,3,40,"2FAST");
       
       lista.add(yate1);
       lista.add(velero1);
       lista.add(deportiva1);
       
       for(Barco bar:lista){
           bar.calcPrecio();
       }
       
    }
    
}
