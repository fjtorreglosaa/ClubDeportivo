package Entidades.Jugador;

public class clsPortero extends clsJugador{

    private int paradasDeGol;
    private int golesRecibidos;
    
    public int getParadasDeGol() {
        return paradasDeGol;
    }
    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    public void setParadasDeGol(int paradasDeGol) {
        this.paradasDeGol = paradasDeGol;
    }
    
}
