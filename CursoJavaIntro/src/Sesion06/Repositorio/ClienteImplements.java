package Sesion06.Repositorio;

import Sesion06.Interfaces.ICliente;

public class ClienteImplements implements ICliente {

    @Override
    public String saludoCliente(String NombreCliente) {
        return "Hola Estimado "+ NombreCliente;
    }
}
