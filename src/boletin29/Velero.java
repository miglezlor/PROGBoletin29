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
public class Velero extends Barco{

    private int nmastil;
    
    public Velero() {
    }

    public Velero(int nmastil, int ndias, int eslora, String matricula) {
        super(ndias, eslora, matricula);
        this.nmastil = nmastil;
    }

    
    public int getNmastil() {
        return nmastil;
    }

    public void setNmastil(int nmastil) {
        this.nmastil = nmastil;
    }


    @Override
    public String toString() {
        return "Velero{" + "nmastil=" + nmastil + '}';
    }
    
    @Override
    public void calcPrecio() {
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getNdias()*(super.getEslora()*10+nmastil)+" €");
                
    }
    
}
