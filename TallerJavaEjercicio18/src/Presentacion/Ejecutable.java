package Presentacion;

import Clases.Serie;
import Clases.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();
        List<Videojuego> videojuegos = new ArrayList<>();
        //Generar 5 objetos series & videojuegos
        for(int i=0;i<5;i++){
            if(i%2==0){
                series.add(new Serie("tituloSerie"+i,"generoSerie"+i,"creadorSerie"+i,i+1));
                videojuegos.add(new Videojuego());
            }else{
                series.add(new Serie());
                videojuegos.add(new Videojuego("tituloJuego"+i,"generoJuego"+i,"companiaJuego"+i,i+1));
            }
        }
        //Entregar algunos
        for(int i=0;i<5;i++){
            if(i==1){
                series.get(i).entregar();
            }
            if(i==4){
                videojuegos.get(i).entregar();
            }
            if(i==3){
                series.get(i).entregar();
            }
            if(i==0){
                videojuegos.get(i).entregar();
            }
        }
        //Contar cuantas series y videojuegos entregados hay
        System.out.println("Series entregadas: "+contarSeriesEntregadas(series));
        System.out.println("Videojuegos entregados: "+contarVideojuegosEntregados(videojuegos));
        //Ver cual serie tiene mas temporadas y retornarals con el metodo toString sobrescrito.
        System.out.println("Serie con más temporadas:");
        System.out.println(getSerieConMasTemporadas(series).toString());
        //Ver cual videojuego tiene mas horas estimadas y retornarlo con el metodo toString sobrescrito.
        System.out.println("Videojuego con más horas estimadas:");
        System.out.println(getVideoJuegoConMasHorasEstimadas(videojuegos).toString());

    }
    public static int contarSeriesEntregadas(List<Serie> series){
        int cont=0;
        for(int i=0;i<series.size();i++){
            if(series.get(i).isEntregado()){
                cont++;
            }
        }
        return cont;
    }
    public static int contarVideojuegosEntregados(List<Videojuego> juegos){
        int cont=0;
        for(int i=0;i<juegos.size();i++){
            if(juegos.get(i).isEntregado()){
                cont++;
            }
        }
        return cont;
    }
    public static Serie getSerieConMasTemporadas(List<Serie> series){
        Serie serieAux = series.get(0);
        for(int i=0;i<series.size();i++){
            if(series.get(i).compareTo(serieAux)==1){
                serieAux=series.get(i);
            }
        }
        return  serieAux;
    }
    public static Videojuego getVideoJuegoConMasHorasEstimadas(List<Videojuego> juegos){
        Videojuego videojuegoAux = juegos.get(0);
        for(int i=0;i<juegos.size();i++){
            if(juegos.get(i).compareTo(videojuegoAux)==1){
                videojuegoAux=juegos.get(i);
            }
        }
        return videojuegoAux;
    }
}
