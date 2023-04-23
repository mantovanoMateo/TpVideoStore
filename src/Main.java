import Models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello VideoStore!");
        Boolean rta;
        Cliente busc = null;
        Pelicula creada = null;
        VideoStore vs1 = new VideoStore();

        rta = vs1.agregaCliente("42322678", "Mateo", "Mantovano", "mantovanomateo@gmail.com", "Larrea875");
        if (rta == true) {
            System.out.println("Cliente agregado con exito");
        } else {
            System.out.println("Algo malo paso");
        }

        rta = vs1.agregaCliente("42678322", "Ignacio", "Palomo", "palomonacho@gmail.com", "Larrea875");
        if (rta == true) {
            System.out.println("Cliente agregado con exito");
        } else {
            System.out.println("Algo malo paso");
        }

        rta = vs1.agregaCliente("42678322", "Ignacio", "Palomo", "palomonacho@gmail.com", "Larrea875");
        if (rta == true) {
            System.out.println("Cliente agregado con exito");
        } else {
            System.out.println("Algo malo paso");
        }

        rta = vs1.agregaCliente("78322426", "Tomas", "Palomo", "palomotomas@gmail.com", "Larrea875");
        if (rta == true) {
            System.out.println("Cliente agregado con exito");
        } else {
            System.out.println("Algo malo paso");
        }

        System.out.println("\nAhora mostraremos un cliente buscado por dni");
        busc = vs1.buscarCliente("42322678");
        if (busc == null) {
            System.out.println("El cliente no existe");
        } else {
            System.out.println(busc.toString());
        }

        vs1.cargarNuevaPelicula("Avatar", "2009", 200, Clasificacion.PG, Genero.AVENTURA, "EEUU", "Aventuras de un soldado haciendose pasar por un avatar en un planeta extraterreste", 10);
        vs1.cargarNuevaPelicula("Avengers:Endgame", "2019", 220, Clasificacion.R, Genero.ACCION, "EEUU", "La pelea final de los vengadores por salvar al universo", 7);
        vs1.cargarNuevaPelicula("Titanic", "1997", 180, Clasificacion.NC17, Genero.DRAMA, "England", "La historia de dos jovenes enamorados de desitintas clases sociales en el conocido buque titanic", 5);
        vs1.cargarNuevaPelicula("Spiderman", "2021", 190, Clasificacion.PG13, Genero.ACCION, "EEUU", "Un joven adquiere poderes aracnidos luego de ser mordido por una arrania y decide luchar contra los delincuentes", 4);
        vs1.cargarNuevaPelicula("Jurassic World", "2015", 185, Clasificacion.NC17, Genero.AVENTURA, "EEUU", "La historia de un parque tematico con dinosaurios reales y como se descontrola toodo", 12);
        vs1.cargarNuevaPelicula("Joker", "2019", 215, Clasificacion.R, Genero.HORROR, "EEUU", "La surgida del joker, villano mas famoso de batman", 9);
        vs1.cargarNuevaPelicula("Mi villano Favorito 2", "2013", 176, Clasificacion.PG13, Genero.COMEDIA, "EEUU", "Continuacion de la histria de Gru sus hijas y sus minions y sus desventuras", 3);
        vs1.cargarNuevaPelicula("Icaro", "2017", 180, Clasificacion.NC17, Genero.DOCUMENTAL, "EEUU", "Cuenta la verdad tras un escandalos de dopaje deportivo", 5);
        vs1.cargarNuevaPelicula("Shrek 2", "2004", 194, Clasificacion.PG, Genero.COMEDIA, "EEUU", "Cuenta la continuacion de las historias de Shrek nuestro ogro preferido", 13);
        vs1.cargarNuevaPelicula("Independence Day", "1996", 178, Clasificacion.PG13, Genero.DRAMA, "EEUU", "Drama sobre una invacion alienigena", 7);
        vs1.cargarNuevaPelicula("Game Changer", "2018", 200, Clasificacion.R, Genero.DOCUMENTAL, "EEUU", "Un luchador de UFC habla con cientificos y atletas de elite en busca de la dieta optima", 2);

        System.out.println("\nAhora buscaremos una pelicula por nombre");
        creada = vs1.buscarPelicula("Joker");
        if (creada != null) {
            System.out.println("Encontrada: " + creada.toString());
        } else {
            System.out.println("Algo malo paso");
        }

        System.out.println("\nAhora generaremos unos alquileres");

        busc = vs1.buscarCliente("42322678");
        if (busc != null) {
            creada = vs1.buscarPelicula("Icaro");
            if (creada != null) {
                vs1.generaAlquiler(busc, creada, "09/04/2023");
                System.out.println("Alquiler generado");
            } else {
                System.out.println("La pelicula que ingreso no existe");
            }
        } else {
            System.out.println("El cliente no existe");
        }

        System.out.println(vs1.mostrarPeliculasPorCateogria(Genero.DOCUMENTAL));

        System.out.println("mostramos ultimos Alquileres de 42322678");
        busc = vs1.buscarCliente("42322678");
        System.out.println(busc.ultimosAlquileres());

        System.out.println("mostramos alquileres vigentes");
        System.out.println(vs1.ConsultarAlquileresVigentes());


    }
}