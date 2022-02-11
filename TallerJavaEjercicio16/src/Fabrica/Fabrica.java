package Fabrica;

import Interfaz.interfazPersona;
import Controlador.controladorPersona;

public class Fabrica {
    private static Fabrica instancia;

    public Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public interfazPersona getInterfazPersona(){
        interfazPersona iPersona = controladorPersona.getInstance();
        return iPersona;
    }
}
