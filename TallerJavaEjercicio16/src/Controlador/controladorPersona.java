package Controlador;

import Interfaz.interfazPersona;

import java.util.Random;


public class controladorPersona implements interfazPersona {
    private static controladorPersona instancia;

    static final int insuficiente = -1;
    static final int normal = 0;
    static final int sobrepeso = 1;

    public controladorPersona(){

    }

    public static controladorPersona getInstance() {
        if (instancia == null) {
            instancia = new controladorPersona();
        }
        return instancia;
    }

    public int calcularIMC(double peso, double altura){
        double estado = 0;
        estado = (peso / (Math.pow(altura,2)));
        if(estado<20){
            return insuficiente;
        }
        if(estado>=20 && estado<=25){ //18.5–24.9
            return normal;
        }
        if(estado>25){
            return sobrepeso;
        }
        return -2;
    }

    public boolean esMayorDeEdad(int edad){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    }

    public char comprobarSexo(char sexo){
        if(sexo=='M' || sexo=='m' || sexo=='H' || sexo=='h'){
            return sexo;
        }else{
            return 'H';
        }
    }

    public String toString(String nombre, int edad, int DNI,char genero, double peso, double altura){
        String objeto= new String("");
        objeto+="Nombre: "+nombre+", ";
        objeto+="Edad: "+edad+", ";
        objeto+="DNI: "+DNI+", ";
        objeto+="Genero: "+genero+", ";
        objeto+="Peso: "+peso+", ";
        objeto+="Altura: "+altura+", ";
        return objeto;
    }

    public int generaDNI(){
        Random random = new Random();
        return random.nextInt(99999999);
    }


}
