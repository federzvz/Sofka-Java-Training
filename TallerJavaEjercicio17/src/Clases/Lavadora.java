package Clases;

public class Lavadora extends Electrodomestico{
    final static double cargaDefault=5;

    private double carga=cargaDefault;

    public Lavadora(){

    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void precioFinal(){
        if(this.carga>30){
            super.precioFinal();
            super.aumentarPrecio(50);
        }
    }

}
