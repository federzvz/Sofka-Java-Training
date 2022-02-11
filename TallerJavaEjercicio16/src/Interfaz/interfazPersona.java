package Interfaz;

public interface interfazPersona {
    public abstract int calcularIMC(double peso, double altura);
    public abstract boolean esMayorDeEdad(int edad);
    public abstract char comprobarSexo(char sexo);
    public abstract String toString(String nombre, int edad, int DNI,char genero, double peso, double altura);
    public abstract int generaDNI();
}
