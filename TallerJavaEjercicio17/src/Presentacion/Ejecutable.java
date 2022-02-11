package Presentacion;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Clases.Television;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        //Crear el array de objetos
        List<Electrodomestico> electros = new ArrayList<>();
        int iteradorAux=0;
        double precioElectrosTotal=0,precioLavadorasTotal=0,precioTelevisionesTotal=0;

        //Crear los electrodomesticos con los valores deseados
        for(int i=0;i<10;i++){
            if(i%2==0){
                electros.add(new Lavadora(i+9.5,i+6,"Violeta",'E',i+5));
            }
           else{
               if(iteradorAux%2==0){
                   electros.add(new Television(i+12.4,i+4,"negro",'E',5*i,true));
               }else{
                   electros.add(new Television(i+12.4,i+4,"negro",'E',5*i,false));
               }
               iteradorAux++;
            }
        }

        //Ahora, recorre este array y ejecuta el método precioFinal().
        for(int i=0;i<electros.size();i++){
            electros.get(i).precioFinal();
        }

        //Mostrar el precio final de cada electrodomestrico
        for(int i=0;i<electros.size();i++){
            if(electros.get(i) instanceof Electrodomestico){
                if(i%2==0){
                    System.out.println("Lavadora#"+i+1+": $"+electros.get(i).getPrecioBase());
                    precioLavadorasTotal+=electros.get(i).getPrecioBase();
                }
                else{
                    System.out.println("Television#"+i+1+": $"+electros.get(i).getPrecioBase());
                    precioTelevisionesTotal+=electros.get(i).getPrecioBase();
                }
            }
        }
        //Mostrar el precio Total de cada tipo de Electrodomestico
        System.out.println();
        System.out.println("Precio total Lavadoras: $"+precioLavadorasTotal);
        System.out.println("Precio total Television: $"+precioTelevisionesTotal);
        System.out.println("Precio total Electrodomesticos: $"+((double)precioLavadorasTotal+(double)precioTelevisionesTotal));
    }
}
