import java.sql.Timestamp;
import java.util.Date;

/*
Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println(obtenerFechaHora());
    }
    public static String obtenerFechaHora(){ //(AAAA/MM/DD) (HH:MM:SS)
        Date date = new Date();
        String fechaHora="(";
        String anio=Integer.toString(date.getYear()+1900);
        fechaHora+=anio+"/";
        String mes=Integer.toString(date.getMonth()+1);
        fechaHora+=mes+"/";
        String dia=Integer.toString(date.getDay()+6);
        fechaHora+=dia+") (";
        String hora=Integer.toString(date.getHours());
        fechaHora+=hora+":";
        String mins=Integer.toString(date.getMinutes());
        fechaHora+=mins+":";
        String segs=Integer.toString(date.getSeconds());
        fechaHora+=segs+")";

        return fechaHora;
    }
}
