package Entidades.Jugador;

import java.util.ArrayList;
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
    private int cantidadLesiones;
    private List<clsLesion> lesiones = new ArrayList<>();
    public int minutosDeJuego;
    private int disparosAPuerta;
    
    public clsJugador() {
        super();
        while (true){
            try {
                cantidadLesiones = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de lesiones que ha tenido el jugador:"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde a un número. Escribalo nuevamente");
            }
            break;
        }
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

    private void AddLesion(clsLesion lesion){

        while (true){
            try {
                String nombreLesion = JOptionPane.showInputDialog("Escriba el nombre de la lesión:");
                int diasIncapacidadLesion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de incapacidad de la lesión:"));
                String severidadLesion = JOptionPane.showInputDialog("Escriba la severidad de la lesión:");
                lesion.setNombre(nombreLesion);
                lesion.setDiasIncapacidad(diasIncapacidadLesion);
                lesion.setSeveridad(severidadLesion);
                lesiones.add(lesion);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese nuevamente los datos de la lesión.");
            }
            break;   
        }
    }

    public void AddLesiones(){
        for (int i = 0; i < cantidadLesiones; i++) {
            JOptionPane.showMessageDialog(null, "INFORMACIÓN: Ingrese la lesión" + i+1);
            AddLesion(new clsLesion());
        }
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
