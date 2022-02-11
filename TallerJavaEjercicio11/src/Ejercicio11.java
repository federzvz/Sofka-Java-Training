import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String txt;
        try{
            System.out.print("Ingresa una frase: ");
            txt = keyScanner.nextLine();
            System.out.println("Tamaño: "+getStringSize(txt));
            System.out.println("Cantidad de vocales: "+getCantidadVocales(txt));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static int getStringSize(String txt){
        char[] chars = txt.toCharArray();
        int tam=0;
        while(tam<chars.length){
            tam++;
        }
        return tam;
    }

    public static int getCantidadVocales(String txt){
        char[] chars = txt.toLowerCase().toCharArray();
        int tam=0,vocales=0;
        while(tam<chars.length){
            if(chars[tam]=='a' || chars[tam]=='e' || chars[tam]=='i' || chars[tam]=='o' || chars[tam]=='u'){
                vocales++;
            }
            tam++;
        }
        return vocales;
    }
}
