import java.util.Scanner;

/*
Haz una aplicación que calcule el área de un círculo(pi*R2).
El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
Usa la constante PI y el método pow de Math.
 */
public class Ejercicio3 {
    static final double pi = Math.PI;

    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        double radio=0;

        System.out.print("Ingresa el radio: ");
        try {
            radio=keyScanner.nextDouble();
            System.out.print("El Area= "+calcularArea(radio));
        }catch (Exception e){
            System.out.print("No ingreso un número válido.");
        }
    }
    public static double calcularArea(double radio){
        return pi*Math.pow(radio,2);
    }
}
