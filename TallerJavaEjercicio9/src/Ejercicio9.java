import java.util.Scanner;

/*
Del texto, “La sonrisa sera la mejor arma contra la tristeza”
Reemplaza todas las a del String anterior por una e,
adicionalmente concatenar a esta frase una adicional que
ustedes quieran incluir por consola y las muestre luego unidas.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String texto="La sonrisa sera la mejor arma contra la tristeza";
        String textoByUserInput;
        try{
            texto = texto.replace('a','e');
            System.out.print("Ingresa una frase:");
            textoByUserInput=keyScanner.nextLine();
            System.out.println("Texto remplazado + frase del usuario:");
            System.out.println(texto+" <[+]> "+textoByUserInput);
        }catch (Exception e){
            System.out.print(e.toString());
        }
    }
}
