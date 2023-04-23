package Models;

public class Alquiler {

    //region Atributos
    private Cliente cliente;
    private Pelicula pelicula;
    private Boolean vigente;
    private String fechaDevolucion;
    //endregion

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Pelicula pelicula, String fechaDevolucion) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.vigente = true;
        this.fechaDevolucion = fechaDevolucion;

    }

    //region Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Boolean getVigente() {
        return vigente;
    }

    //endregions


    //region Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    //endregion


    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", pelicula=" + pelicula +
                '}';
    }
}
