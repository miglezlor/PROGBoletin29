package boletin29;

/**
 *
 * @author ?
 */
public class Deportiva extends Barco{

    private int potencia;

    public Deportiva() {
    }

    public Deportiva(int potencia, int ndias, int eslora, String matricula) {
        super(ndias, eslora, matricula);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Deportiva{" + "potencia=" + potencia + '}';
    }
    
    @Override
    public void calcPrecio() {
        System.out.println("Matricula : "+super.getMatricula()+" | Eslora : "+super.getEslora()+" | Precio : "+super.getNdias()*(super.getEslora()*10+potencia)+" €");
    }
    
}
