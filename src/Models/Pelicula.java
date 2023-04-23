package Models;

import java.util.Date;

public class Pelicula implements Comparable<Pelicula> {

    //region Atributos
    private String titulo;
    private String fecha;
    private Integer duracion;
    private Clasificacion clasificacion;
    private Genero genero;
    private String paisOrigen;
    private String descripcion;
    private Integer cantidadCopias;
    private Integer vecesAlquilada;

    //endregion

    //region Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String fecha, Integer duracion, Clasificacion clasificacion, Genero genero, String paisOrigen, String descripcion, Integer cantidadCopias) {

        this.titulo = titulo;
        this.fecha = fecha;
        this.duracion = duracion;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.cantidadCopias = cantidadCopias;
        this.vecesAlquilada = 0;
        this.clasificacion = clasificacion;
        this.genero = genero;

    }

    //endregion

    //region Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadCopias(Integer cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public void setVecesAlquilada(Integer vecesAlquilada) {
        this.vecesAlquilada = vecesAlquilada;
    }

    public void disminuyeCantidadDeCopias() {
        this.cantidadCopias = this.cantidadCopias - 1;
    }

    public void aumentaVecesAlquilada() {
        this.vecesAlquilada = this.vecesAlquilada + 1;
    }


    //endregion

    //region Getters
    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getGenero() {
        return genero.getNombre();
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getCantidadCopias() {
        return cantidadCopias;
    }

    public Integer getVecesAlquilada() {
        return vecesAlquilada;
    }

    //endregion


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracion=" + duracion +
                ", clasificacion=" + clasificacion +
                ", genero=" + genero +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidadCopias=" + cantidadCopias +
                ", vecesAlquilada=" + vecesAlquilada +
                '}';
    }

    @Override
    public int compareTo(Pelicula peli) {
        if (peli.getVecesAlquilada() < vecesAlquilada) {
            return -1;
        } else if (peli.getVecesAlquilada() < vecesAlquilada) {
            return 0;
        } else {
            return 1;
        }
    }
}
