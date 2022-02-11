/*
Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            if(i%2==0){
                System.out.println(i+" es par.");
            }else{
                System.out.println(i+" es impar.");
            }
            i++;
        }
    }
}
