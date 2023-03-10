public class Cuenta {
    private String titular;
    private double cantidad;

    //Contructores
    public Cuenta(String titular) {
        this(titular,0);
    }

    public Cuenta(String titular,double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo pnemos en cero
        if (cantidad < 0) {
            this.cantidad = 0;
        }else {
            this.cantidad = cantidad;
        }
    }

    //Metodos

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void  ingresar(double cantidad){
        if (cantidad >0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString(){
        return "titular " + titular + " tiene " + cantidad + " Pesos Colombianaos";
    }



}
