package Sesion06.Interfaces;

import Sesion06.Entidades.ResponseCliente;
import Sesion06.Entidades.Usuario;

public interface IAutenticar {

    public ResponseCliente autentica(Usuario usuario);
}
