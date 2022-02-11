import java.util.Scanner;

/*
Realizar una aplicación de consola, que al ingresar una frase
por teclado elimine los espacios que esta contenga.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String txt;
        try{
            System.out.print("Ingresa una frase: ");
            txt = keyScanner.nextLine();
            txt=txt.replace(" ","");
            System.out.println(txt);
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
