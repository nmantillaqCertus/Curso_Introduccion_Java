package Sesion06.Repositorio;

import Sesion06.Entidades.Cliente;
import Sesion06.Entidades.ResponseCliente;
import Sesion06.Entidades.Usuario;
import Sesion06.Interfaces.IAutenticar;
public class AutenticarImplements implements IAutenticar {

    @Override
    public ResponseCliente autentica(Usuario usuario) {

        //Datos de la base de datos
        Usuario usuarioAux = new Usuario();
        usuarioAux.setUsuario("CLI123");
        usuarioAux.setPassword("123456");

        Cliente clientito = new Cliente();
        clientito.setCod_Persona(555999);
        clientito.setNombres("Clientito :D");
        clientito.setApellidos("Gonzales");
        clientito.setEdad(30);
        clientito.setDireccion("Av. Camino hacía ti 999");
        clientito.setDNI(40455659);
        clientito.setCod_Cliente(555999123);
        clientito.setRUC("10454545451");
        clientito.setUsuario(usuarioAux);
        //Fin Datos de la base de datos


        //Lógica de Autenticación
        boolean existe = true;
        boolean datosCorrectos  = true;

        if (!usuario.getUsuario().equals(clientito.getUsuario().getUsuario())){
            existe = false;
        }

        if (existe && !usuario.getPassword().equals(clientito.getUsuario().getPassword())){
            datosCorrectos  = false;
        }

        ResponseCliente respueta = new ResponseCliente();

        if (existe && datosCorrectos){
            respueta.setCliente(clientito);
        }
        respueta.setExiste(existe);
        respueta.setDatosCorrectos(datosCorrectos);


        return respueta;
    }
}
