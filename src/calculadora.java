public class calculadora {

    private String marca;
    private boolean escientifica;
    private double primerValor;
    private double segundoValor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEscientifica() {
        return escientifica;
    }

    public void setEscientifica(boolean escientifica) {
        this.escientifica = escientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public calculadora(String marca) {
        this.marca = marca;
    }

    public calculadora(boolean escientifica) {
        this.escientifica = escientifica;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;




    }
}
