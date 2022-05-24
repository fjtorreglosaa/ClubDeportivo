package Entidades.Directivos;

import Entidades.clsPersona;

public class clsDirectivo extends clsPersona{

    private String permisos;
    private String funciones;
    private clsSecretaria secretaria;

    public String getPermisos() {
        return permisos;
    }

    public clsSecretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(clsSecretaria secretaria) {
        this.secretaria = secretaria;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    
    @Override
    public void IngresarInformacion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void CrearEntidad() {
        // TODO Auto-generated method stub
        
    }
    
}
