package boletin29;

/**
 *
 * @author ?
 */
public abstract class Barco {
    private int ndias,eslora;
    private String matricula;

    public Barco() {
    }

    public Barco(int ndias, int eslora, String matricula) {
        this.ndias = ndias;
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Barco{" + "ndias=" + ndias + ", eslora=" + eslora + ", matricula=" + matricula + '}';
    }
    
    public abstract void calcPrecio();
}
