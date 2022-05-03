package Entidades;

public class clsLesion 
{
    private int id;
    private String Nombre;
    private int diasIncapacidad;
    private String severidad;
    
    public int getId() {
        return id;
    }
    public String getSeveridad() {
        return severidad;
    }
    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }
    public int getDiasIncapacidad() {
        return diasIncapacidad;
    }
    public void setDiasIncapacidad(int diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
}
