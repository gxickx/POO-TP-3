package modelos;
/*Cada libro debe contar con la siguiente información: título, autor (nombre completo),
número ISBN, año de publicación y un indicador que señale si está disponible o no para ser
prestado.*/
public class Libro {
    private String titulo;
    private String nombreAutor;
    private int numISBN;
    private int anioPublicacion;
    private boolean esDisponible;

//constructores
    public Libro (String titulo, String nombreAutor, int numISBN, int anioPublicacion, boolean esDisponible) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.numISBN = numISBN;
        setAnioPublicacion(anioPublicacion);
        this.esDisponible = esDisponible;

    }
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public int getNumISBN() {
        return numISBN;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() { // Convención en boolean: "is" en lugar de "get"
        return esDisponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setNumISBN(int numISBN) {
        this.numISBN = numISBN;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 2025) {
            if (anioPublicacion >= 0) {
                this.anioPublicacion = anioPublicacion;
            } else {
                System.out.println("El año no puede ser negativo.");
            }
        } else {
            System.out.println("El año no puede ser mayor al año actual! ");
        }
    }

    public void setDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    public String obtenerInformacionLibro() { // Ahora devuelve un String
        return "Título del libro: " + titulo + ", Autor: " + nombreAutor +
                ", Número ISBN: " + numISBN + ", Año de publicación: " + anioPublicacion +
                ", Disponibilidad: " + esDisponible;
    }

    public void prestarLibro (){
        if (esDisponible){
            System.out.println("Libro disponible.... prestando ...");
            esDisponible = false;
            System.out.println("El libro:" + obtenerInformacionLibro() + " fue prestado ");

        } else {
            System.out.println("El libro no està disponible :(");
        }

    }

    public void devolverLibro (){
        if (!esDisponible){
            System.out.println("Devolviendo libro...");
            esDisponible = true;
            System.out.println("El libro:" + obtenerInformacionLibro() + " fue devuelto :D ");

        } else {
            System.out.println("No podes devolver un libro que està disponible!!!!! ");
        }

    }

    public boolean esClasico() {
        int anioActual = java.time.Year.now().getValue();
        return (anioActual - anioPublicacion) > 50;
    }

}