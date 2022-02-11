import java.util.Scanner;

/* EJERCICIO 4
Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Ejercicio4 {
    static final double IVA=0.21;
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        double precio = 0;
        System.out.print("Ingrese el precio del producto: ");
        try {
            precio = keyScanner.nextDouble();
            System.out.print("Precio final: $"+(precio+precio*IVA));
        }catch (Exception e){
            System.out.print("No se ha ingresado un valor numerico correcto.");
        }
    }
}
