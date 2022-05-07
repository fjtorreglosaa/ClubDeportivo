import javax.swing.JOptionPane;

import Entidades.clsLesion;
import Entidades.Jugador.clsJugador;

public class Start 
{
    public static void main(String args[]){
        clsJugador jugador = new clsJugador();
        jugador.AddLesiones();
        for (clsLesion lesion : jugador.getLesiones()) {
            JOptionPane.showMessageDialog(null, lesion.getId());
        }
    }
}