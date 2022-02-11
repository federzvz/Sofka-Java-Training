package Clases;

import Interfaz.Entregable;

public class Serie implements Entregable {
    private String titulo="", genero="", creador="";
    private int numeroTemporadas=3;
    private boolean entregado=false;

    public Serie(){

    }
    public Serie(String tutilo, String creador){
        this.titulo=tutilo;
        this.creador=creador;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
    }

        /*
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
     */

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String toString(){
        String objeto= new String("");
        objeto+="titulo: "+this.titulo+", ";
        objeto+="genero: "+this.genero+", ";
        objeto+="creador: "+this.creador+", ";
        objeto+="numeroTemporadas: "+this.numeroTemporadas+", ";
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
        Serie serie = (Serie) a;
        if(this.numeroTemporadas>serie.getNumeroTemporadas()){
            return 1;
        }
        else if(this.numeroTemporadas==serie.getNumeroTemporadas()){
            return 0;
        }
        return -1;
    }
}
