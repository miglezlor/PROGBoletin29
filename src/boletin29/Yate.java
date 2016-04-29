/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin29;

/**
 *
 * @author ?
 */
public class Yate extends Barco{

    private int ncamarotes;
    private int potencia;
    
    public Yate() {
        
    }

    public Yate(int ncamarotes, int potencia, int ndias, int eslora, String matricula) {
        super(ndias, eslora, matricula);
        this.ncamarotes = ncamarotes;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    

    public int getNcamarotes() {
        return ncamarotes;
    }

    public void setNcamarotes(int ncamarotes) {
        this.ncamarotes = ncamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "ncamarotes=" + ncamarotes + '}';
    }
    
    
    @Override
    public void calcPrecio() {
        
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getNdias()*(super.getEslora()*10+ncamarotes+potencia)+" €");
    }
    
}
