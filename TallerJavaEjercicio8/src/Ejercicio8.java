import java.util.Scanner;

/*
Crea una aplicación por consola que nos pida un día
de la semana y que nos diga si es un día laboral o no.
Usa un switch para ello
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String dia;
        while(true){
            try {
                System.out.print("Ingrese un dia: ");
                dia = keyScanner.nextLine();
                switch (dia.toLowerCase()) {
                    case "lunes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "martes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "miercoles":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "jueves":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "viernes":
                        System.out.println("Si es un dia laboral.");
                        break;
                    case "sabado":
                        System.out.println("No es un día laboral, a descansar.");
                        break;
                    case "domingo":
                        System.out.println("No es un día laboral, a descansar.");
                        break;
                    default:
                        System.out.println("El día que ingresó solo existe en su planeta mental.");
                        break;
                }
            } catch (Exception e) {
                System.out.print(e.toString());
            }
        }
    }
}
