import java.util.Scanner;

/*
Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String txt1,txt2;
        try{
            System.out.print("Ingresa una palabra: ");
            txt1 = keyScanner.nextLine();
            System.out.print("Ingresa otra palabra: ");
            txt2 = keyScanner.nextLine();
            if(txt1.equalsIgnoreCase(txt2)){
                System.out.println("Son iguales.");
            }else{
                System.out.println("No son iguales, diferencias: "+ obtenerDiferencias(txt1,txt2));
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static String obtenerDiferencias(String txt1, String txt2) {
        if (txt1 == null) {
            return txt2;
        }
        if (txt2 == null) {
            return txt1;
        }
        int at = indiceDeLaDiferencia(txt1, txt2);
        if (at == -1) {
            return "";
        }
        return txt2.substring(at);
    }

    public static int indiceDeLaDiferencia(String txt1, String txt2) {
        if (txt1 == txt2) {
            return -1;
        }
        if (txt1 == null || txt2 == null) {
            return 0;
        }
        int i;
        for (i = 0; i < txt1.length() && i < txt2.length(); ++i) {
            if (txt1.charAt(i) != txt2.charAt(i)) {
                break;
            }
        }
        if (i < txt2.length() || i < txt1.length()) {
            return i;
        }
        return -1;
    }
}
