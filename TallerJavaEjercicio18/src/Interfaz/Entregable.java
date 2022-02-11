package Interfaz;

public interface Entregable {
    /*
    entregar(): cambia el atributo prestado a true.
devolver(): cambia el atributo prestado a false.
isEntregado(): devuelve el estado del atributo prestado.
Método compareTo (Object a),
     */
    public void entregar();
    public boolean isEntregado();
    public int compareTo(Object a);
}
