import java.util.Scanner;

/*
Al ejercicio anterior agregar entrada por consola de
dos valores e indicar si son mayores, menores o iguales.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0,y=0;
        System.out.print("Ingrese un numero x:");
        x=scanner.nextInt();
        System.out.print("Ingrese un numero y:");
        y=scanner.nextInt();
        System.out.println(esXmayorQueY(x,y));

    }
    public static String esXmayorQueY(int x,int y){
        if(x>y){
            return "x:"+x+" es mayor a y:"+y;
        }
        if(x==y){
            return "x:"+x+" es igual a y:"+y;
        }
        return "x:"+x+" es menor a y:"+y;
    }
}
