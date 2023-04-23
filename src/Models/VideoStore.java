package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class VideoStore {

    //region Atributos
    private String Nombre;
    private ArrayList<Pelicula> peliculas;
    //Los generos pedidos son 6 Acción, Aventura, Comedia,Drama, Horror y Documental
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;
    //endregion


    public VideoStore() {

        //Aca creamos el arraylist que contendra a los clientes
        this.clientes = new ArrayList<>();
        this.alquileres = new ArrayList<>();
        this.peliculas = new ArrayList<>();

    }

    //region Clientes
    public Boolean agregaCliente(String dni, String nombre, String apellido, String email, String direccion) {

        Cliente nuevo = null;
        Boolean agregado = false;
        nuevo = buscarCliente(dni);

        if (nuevo == null) {
            nuevo = new Cliente(dni, nombre, apellido, email, direccion);
            clientes.add(nuevo);
            agregado = true;
        }
        return agregado;
    }

    public Cliente buscarCliente(String dni) {
        Boolean encontrado = false;
        Integer i = 0;
        Cliente enc = null;
        String DNI = " ";

        while (encontrado == false && i < clientes.size()) {
            if (clientes.get(i).getDni().equals(dni)) {
                encontrado = true;
                enc = clientes.get(i);
            } else {
                i++;
            }
        }


        return enc;

    }

    //endregion

    //region Peliculas

    public Boolean cargarNuevaPelicula(String TituloPelicula, String fecha, Integer duracion, Clasificacion clasificacion, Genero genero, String paisOrigen, String descripcion, Integer cantidadDeCopias) {
        Pelicula nueva = null;
        Boolean creada = false;
        nueva = buscarPelicula(TituloPelicula);
        if (nueva == null) {
            nueva = new Pelicula(TituloPelicula, fecha, duracion, clasificacion, genero, paisOrigen, descripcion, cantidadDeCopias);
            creada = true;
            peliculas.add(nueva);
            Collections.sort(peliculas);

        }

        return creada;
    }

    public Pelicula buscarPelicula(String nombre) {
        Boolean encontrado = false;
        Integer i = 0;
        Pelicula busc = null;

        while (encontrado == false && i < peliculas.size()) {
            if (nombre.equals(peliculas.get(i).getTitulo())) {
                encontrado = true;
                busc = peliculas.get(i);
            } else {
                i++;
            }
        }

        return busc;
    }

    public String mostrarPeliculasPorCateogria(Genero genero) {
        String peliculasGenero = "";
        for (Pelicula pelicula : peliculas) {

            if (pelicula.getGenero().equals(genero.getNombre())) {
                peliculasGenero += pelicula.toString() + "\n ";
            }
        }

        return peliculasGenero;
    }

    //endregion

    //region Alquileres
    public Boolean generaAlquiler(Cliente cliente, Pelicula pelicula, String fechaDevolucion) {
        Boolean film = false;

        if (buscarAlquiler(pelicula.getTitulo(), cliente.getNombre()) == null && pelicula.getCantidadCopias() > 0) {
            film = true;
            Alquiler nuevo = new Alquiler(cliente, pelicula, fechaDevolucion);
            alquileres.add(nuevo);
            cliente.agregarAlquiler(nuevo);
            pelicula.disminuyeCantidadDeCopias();
            pelicula.aumentaVecesAlquilada();
            Collections.sort(peliculas);
        }
        return film;
    }

    public Boolean devolucionAlquiler(String TituloPelicula, String nombreCliente) {
        Alquiler busc = new Alquiler();
        Boolean existe = false;
        Pelicula alquilada = new Pelicula();

        busc = buscarAlquiler(TituloPelicula, nombreCliente);
        if (busc != null) {
            busc.setVigente(false);
            existe = true;
            alquilada = buscarPelicula(TituloPelicula);
            alquilada.setCantidadCopias(alquilada.getCantidadCopias() + 1);
        }

        return existe;
    }

    public String ConsultarAlquileresVigentes() {
        String alquileresVigentes = "";
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getVigente() == true) {
                alquileresVigentes += alquiler.toString() + "\n";
            }
        }
        return alquileresVigentes;
    }

    public Alquiler buscarAlquiler(String nombrePelicula, String nombreCliente) {
        Boolean encontrado = false;
        Integer i = 0;
        Alquiler busc = null;

        while (encontrado == false && i < alquileres.size()) {
            if (nombreCliente.equals(alquileres.get(i).getCliente().getNombre()) && nombrePelicula.equals(alquileres.get(i).getPelicula().getTitulo())) {
                encontrado = true;
                busc = alquileres.get(i);
            } else {
                i++;
            }
        }

        return busc;
    }


    //endregion

}
