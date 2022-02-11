import java.util.Scanner;

/*
Crear un programa que pida un numero por teclado
y que imprima por pantalla los números desde el numero
introducido hasta 1000 con saldos de 2 en 2.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        int numero=0;
        try{
            System.out.print("Ingresa un número: ");
            numero = keyScanner.nextInt();
            imprimirHasta1000DandoSaltos(numero);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void imprimirHasta1000DandoSaltos(int numero){
        if(numero<1000) {
            if(numero%2==0){
                for (int i = numero; i <= 1000; i++) {
                    if (i == numero) {
                        System.out.println(i);
                        continue;
                    }
                    if (i%2==0) {
                        System.out.println(i);
                    }
                }
            }
            if(numero%2!=0){
                for (int i = numero; i < 1000; i++) {
                    if (i == numero) {
                        System.out.println(i);
                        continue;
                    }
                    if (i%2!=0 && i<1000) {
                        System.out.println(i);
                    }
                }
            }
        }
        if (numero > 1000) {
            if(numero%2==0){
                for (int i = numero; i >= 1000; i--) {
                    if (i == numero) {
                        System.out.println(i);
                    } else if (i%2==0) {
                        System.out.println(i);
                    }
                }
            }
            if(numero%2!=0){
                for (int i = numero; i > 1000; i--) {
                    if (i == numero) {
                        System.out.println(i);
                    } else if (i%2!=0 && i>1000) {
                        System.out.println(i);
                    }
                }
            }

        }
    }


}
