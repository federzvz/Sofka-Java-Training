/*
Declara 2 variables numéricas (con el valor que desees),
he indica cual es mayor de los dos. Si son iguales indicarlo también.
*/
public class main {
    public static void main(String[] args) {
        int x=55,y=10;
        System.out.println(esXmayorQueY(x,y));

    }
    public static String esXmayorQueY(int x,int y){
        if(x>y){
            return "x:"+x+" es mayor a y:"+y;
        }
        if(x==y){
            return "x:"+x+" es igual a y:"+y;
        }
        return "x:"+x+" es menor a y:"+y;
    }
}
