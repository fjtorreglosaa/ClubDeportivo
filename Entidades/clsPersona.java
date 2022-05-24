package Entidades;

import javax.swing.JOptionPane;

public abstract class clsPersona 
{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private float salario;
    private static int idGeneral;

    public clsPersona(){
        idGeneral++;
        id = idGeneral;
        while (true){
            try {
                nombre = JOptionPane.showInputDialog("Escriba el nombre de la persona:");
                apellido = JOptionPane.showInputDialog("Escriba el apellido de la persona:");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona:"));
                salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario de la persona:"));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese nuevamente los datos de la persona.");
            }
        }
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
