package Clases;

import Interfaz.Entregable;

public class Videojuego implements Entregable {
    private String titulo="",genero="",compania="";
    private double horasEstimadas=10;
    private boolean entregado=false;

    public Videojuego() {
    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, String genero, String compania, double horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String toString(){
        String objeto= new String("");
        objeto+="titulo: "+this.titulo+", ";
        objeto+="genero: "+this.genero+", ";
        objeto+="compania: "+this.compania+", ";
        objeto+="horasEstimadas: "+this.horasEstimadas+", ";
        objeto+="entregado: "+this.entregado+", ";
        return objeto;
    }

    public void entregar() {
        this.entregado=true;
    }

    public boolean isEntregado() {
        if(this.entregado){
            return true;
        }
        return false;
    }

    public int compareTo(Object a) {
        Videojuego juego = (Videojuego) a;
        if(this.horasEstimadas>juego.getHorasEstimadas()){
            return 1;
        }
        else if(this.horasEstimadas==juego.getHorasEstimadas()){
            return 0;
        }
        return -1;
    }
}
