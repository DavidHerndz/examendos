public class calculadora {

    private String marca;
    private boolean escientifica;
    private double primerValor;
    private double segundoValor;

    public calculadora(String marca, boolean escientifica) {
        this.marca = marca;
        this.escientifica = escientifica;
    }

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


    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;

    }

    double n1;
    double n2;
    double res;
    char operacion;


    public void Operacion(double n1, double n2, char operacion) {

        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }


    public void mostrarResultado(){

        System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);


    }


}
