import modelos.Libro;

//main para probar:
public class Ejercicio2 {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 123456789, 1967, true);
        Libro libro2 = new Libro("1984", "George Orwell", 987654321, 1949, false);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 456789123, 1943, true);

// Mostrar información de los libros
        System.out.println("Libro 1: " + libro1.obtenerInformacionLibro());
        System.out.println("Libro 2: " + libro2.obtenerInformacionLibro());
        System.out.println("Libro 3: " + libro3.obtenerInformacionLibro());

        System.out.println("Ahora veremossss si son clàsicos ");

        if (libro1.esClasico()) {
            System.out.println(libro1.getTitulo() + " es un clásico");
        } else {
            System.out.println(libro1.getTitulo() + " no es un clásico");
        }


    }
}
