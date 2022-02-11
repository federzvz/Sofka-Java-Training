package Clases;

public class Television extends Electrodomestico{
    private double pulgadas=20;
    private boolean sintonizadorTDT=false;

    public Television(){

    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, double pulgadas, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void precioFinal(){
        double precioFinal=0;
        if(this.pulgadas>40){
            precioFinal+=40;
        }
        if(this.sintonizadorTDT){
            precioFinal+=50;
        }
        super.precioFinal();
        super.aumentarPrecio(precioFinal);
    }
}
