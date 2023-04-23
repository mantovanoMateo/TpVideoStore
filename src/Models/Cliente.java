package Models;

import java.util.ArrayList;

public class Cliente {

    //region Atributos
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    private ArrayList<Alquiler> alquileres;
    //endregion

    //region Constructores
    public Cliente() {

    }

    public Cliente(String dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.alquileres = new ArrayList<>();
    }

    //endregion

    //region Setters

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //endregion

    //region Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }
    //endregion

    public void agregarAlquiler(Alquiler nuevo) {
        alquileres.add(0, nuevo);
    }

    public String ultimosAlquileres() {
        String ultAlquileres = " ";
        int i = 0;
        while (i < 10 && i < alquileres.size()) {
            System.out.println("entro al while");
            ultAlquileres += alquileres.get(i).toString() + "\n ";
            i++;
        }
        return ultAlquileres;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


}
