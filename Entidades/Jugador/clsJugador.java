package Entidades.Jugador;

import java.util.List;

import Entidades.clsLesion;
import Entidades.clsPersona;

public class clsJugador extends clsPersona
{
    private int posicion;
    private int goles;
    private int faltas;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private List<clsLesion> lesiones;

    public clsJugador(int id, String nombre, String apellido, int edad, float salario) {
        super(id, nombre, apellido, edad, salario);
    }
    
    @Override
    public void IngresarInformacion() 
    {
        //TODO: Imprimir informacion   
    }

    @Override
    public void CrearEntidad() {
        //TODO: Auto-generated method stub
        
    }

    public void AddLesion(clsLesion lesion){
        //TODO: Crear un JOption pane que agregue las propiedades de las lesiones
        
        lesiones.add(lesion);
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public List<clsLesion> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<clsLesion> lesiones) {
        this.lesiones = lesiones;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    

}
