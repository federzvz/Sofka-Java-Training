package Clases;

import Fabrica.Fabrica;
import Interfaz.interfazPersona;

public class Persona {
    private final String nombre;
    private int edad,DNI;
    private char genero;
    private double peso,altura;
    interfazPersona interfazPersona = (interfazPersona) new Fabrica().getInstance().getInterfazPersona();

    //Constructor por defecto
    public Persona(){
        this.nombre = "";
        this.edad=0;
        this.genero=' ';
        this.peso=0;
        this.altura=0;
        this.DNI=this.generarDNI();
    }

    //Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=this.comprobarSexo(sexo);
        this.peso=0;
        this.altura=0;
        this.DNI=this.generarDNI();
    }

    //Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, int DNI, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generarDNI();
        this.genero = this.comprobarSexo(genero);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        return interfazPersona.calcularIMC(this.peso,this.altura);
    }

    public boolean esMayorDeEdad(){
        return interfazPersona.esMayorDeEdad(this.edad);
    }

    public char comprobarSexo(char sexo){
        return interfazPersona.comprobarSexo(sexo);
    }

    public String toString(){
        return interfazPersona.toString(this.nombre,this.edad,this.DNI,this.genero,this.peso,this.altura);
    }

    public int generarDNI(){
        return interfazPersona.generaDNI();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setInterfazPersona(Interfaz.interfazPersona interfazPersona) {
        this.interfazPersona = interfazPersona;
    }
}
