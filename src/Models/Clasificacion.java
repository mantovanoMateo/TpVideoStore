package Models;

public enum Clasificacion {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17"),
    UNRATED("UNRATED");

    private String nombre;

    private Clasificacion(String nombre) {
        this.nombre = nombre;
    }
}
