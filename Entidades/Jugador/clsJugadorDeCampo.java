package Entidades.Jugador;

public class clsJugadorDeCampo extends clsJugador{
    
    private String tipoJugador;
    private int balonesRecuperados;
    private int dueloGanados;

    
    public String getTipoJugador() {
        return tipoJugador;
    }
    public int getDueloGanados() {
        return dueloGanados;
    }
    public void setDueloGanados(int dueloGanados) {
        this.dueloGanados = dueloGanados;
    }
    public int getBalonesRecuperados() {
        return balonesRecuperados;
    }
    public void setBalonesRecuperados(int balonesRecuperados) {
        this.balonesRecuperados = balonesRecuperados;
    }
    public void setTipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }
    
}
