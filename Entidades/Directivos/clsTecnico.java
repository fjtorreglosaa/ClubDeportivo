package Entidades.Directivos;

public class clsTecnico extends clsDirectivo {

    private String tipoDeTecnico;
    private String titulosGanados;
    
    public String getTipoDeTecnico() {
        return tipoDeTecnico;
    }
    public String getTitulosGanados() {
        return titulosGanados;
    }
    public void setTitulosGanados(String titulosGanados) {
        this.titulosGanados = titulosGanados;
    }
    public void setTipoDeTecnico(String tipoDeTecnico) {
        this.tipoDeTecnico = tipoDeTecnico;
    }
    
}
