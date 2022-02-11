import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String opc = "";
        Scanner keyScanner = new Scanner(System.in);
        while(!opc.equalsIgnoreCase("8")){
            try {
                mostrarMenu();
                opc=keyScanner.nextLine();
                switch (opc){
                    case "1":
                        System.out.println("NUEVO ACTOR");
                        break;
                    case "2":
                        System.out.println("BUSCAR ACTOR");
                        break;
                    case "3":
                        System.out.println("ELIMINAR ACTOR");
                        break;
                    case "4":
                        System.out.println("MODIFICAR ACTOR");
                        break;
                    case "5":
                        System.out.println("VER TODOS LOS ACTORES");
                        break;
                    case" 6":
                        System.out.println("VER PELICULAS DE LOS ACTORES");
                        break;
                    case "7":
                        System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                        break;
                    case "8":
                        System.out.println();
                        return;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        break;
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
        System.out.print("--> ");
    }
}
