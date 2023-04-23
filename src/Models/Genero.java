package Models;

public enum Genero {
    ACCION("accion"),
    AVENTURA("aventura"),
    COMEDIA("comedia"),
    DRAMA("drama"),
    HORROR("horror"),
    DOCUMENTAL("documental");

    private String nombre;

    private Genero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
