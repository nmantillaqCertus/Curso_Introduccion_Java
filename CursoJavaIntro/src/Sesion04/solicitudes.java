package Sesion04;

import java.util.List;

public class solicitudes {
    String nombreSolictud;

    List<Auto> autoLavdo;
    Cliente clienteLavado;

    public List<Auto> getAutoLavdo() {
        return autoLavdo;
    }

    public void setAutoLavdo(List<Auto> autoLavdo) {
        this.autoLavdo = autoLavdo;
    }

    public String getNombreSolictud() {
        return nombreSolictud;
    }

    public void setNombreSolictud(String nombreSolictud) {
        this.nombreSolictud = nombreSolictud;
    }


    public Cliente getClienteLavado() {
        return clienteLavado;
    }

    public void setClienteLavado(Cliente clienteLavado) {
        this.clienteLavado = clienteLavado;
    }
}
