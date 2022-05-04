package Entidades.Jugador;

import java.util.List;

import javax.swing.JOptionPane;

import Entidades.clsLesion;
import Entidades.clsPersona;

public class clsJugador extends clsPersona
{
    private String posicion;
    private int goles;
    private int faltas;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private List<clsLesion> lesiones;
    public int minutosDeJuego;
    private int disparosAPuerta;

    public clsJugador(int id, String nombre, String apellido, int edad, float salario) {
        super(id, nombre, apellido, edad, salario);
    }
    
    public int getDisparosAPuerta() {
        return disparosAPuerta;
    }

    public void setDisparosAPuerta(int disparosAPuerta) {
        this.disparosAPuerta = disparosAPuerta;
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

        while (true){
            try {
                String nombreLesion = JOptionPane.showInputDialog("Type your name please");
                int diasIncapacidadLesion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la lesión:"));
                String severidadLesion = JOptionPane.showInputDialog("Type your name please");
                lesion.setNombre(nombreLesion);
                lesion.setId(diasIncapacidadLesion);
                lesion.setNombre(severidadLesion);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese nuevamente los datos de la lesión.");
            }
            break;   
        }

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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    

}
