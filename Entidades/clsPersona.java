package Entidades;

public abstract class clsPersona 
{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private float salario;

    public clsPersona(int id, String nombre, String apellido, int edad, float salario) {

    }

    //Métodos
    public abstract void IngresarInformacion();
    public abstract void CrearEntidad();

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}
