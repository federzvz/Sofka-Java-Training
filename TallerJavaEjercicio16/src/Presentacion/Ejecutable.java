package Presentacion;

import Clases.Persona;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso,altura;

        try {
            //Pide por teclado el nombre, la edad, sexo, peso y altura.
            System.out.print("Nombre: ");
            nombre = keyScanner.nextLine();
            System.out.print("Edad: ");
            edad = keyScanner.nextInt();
            System.out.print("Sexo: ");
            sexo = keyScanner.next().charAt(0);
            System.out.print("Peso: ");
            peso = keyScanner.nextDouble();
            System.out.print("Altura: ");
            altura = keyScanner.nextDouble();
            //Crear tres instancias del objeto Persona
            Persona persona1 = new Persona(nombre,edad,0,sexo,peso,altura);
            Persona persona2 = new Persona(nombre,edad,0,sexo,0,0);
            Persona persona3 = new Persona();
            //Mostrar Si están en su peso ideal
            System.out.print(mostrarMensajeIMC(persona1.calcularIMC()));
            System.out.print(mostrarMensajeIMC(persona2.calcularIMC()));
            System.out.print(mostrarMensajeIMC(persona3.calcularIMC()));
            //Indicar para cada objeto si es mayor de edad
            System.out.print(mostrarMensajeEsMayorDeEdad(persona1.esMayorDeEdad()));
            System.out.print(mostrarMensajeEsMayorDeEdad(persona2.esMayorDeEdad()));
            System.out.print(mostrarMensajeEsMayorDeEdad(persona3.esMayorDeEdad()));
            //Mostrar la información de cada objeto
            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static String mostrarMensajeIMC(int estadoPeso){
        if(estadoPeso==-1){
            return "Tiene desnutrición.\n";
        }
        if(estadoPeso==0){
            return "Tiene un peso normal.\n";
        }
        if(estadoPeso==1){
            return "Tiene sobrepeso.\n";
        }
        return "";
    }

    public static String mostrarMensajeEsMayorDeEdad(boolean isMayor){
        if(isMayor){
            return "Es mayor de edad.\n";
        }
        return "Es menor de edad.\n";
    }
}
