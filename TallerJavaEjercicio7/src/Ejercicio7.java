import java.util.Scanner;

/*
EJERCICIO 7
Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        int i=0;
        do{
            try{
                System.out.print("Ingresa un numero: ");
                i=keyScanner.nextInt();
                System.out.print("Número ingresado: "+i);
            }catch(Exception e){
                System.out.println("No ha ingresado un valor numérico correcto.");
            }
        }while(i<0);
    }
}
