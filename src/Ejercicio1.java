import modelos.Perro;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("Hola bienvenidos al perro programador\n");

        // modelo.Perro perrito = new modelo.Perro ("Perrito", 20, 0, 5);

        // LISTA DE PERROS
        ArrayList<Perro> perros = new ArrayList<>();

        perros.add(new Perro("Perrito", 20, 20, 15));
        perros.add(new Perro("Pipi", 123, 45, 105));
        perros.add(new Perro("Chloe", 26, 87, 38));
        perros.add(new Perro("Java", 100, 0, 0));

        //bucle for-each, la variable p representa al perro actual. Instancia individual del objeto modelo.Perro
        System.out.println("\nEstado Inicial de los perros");
        for (Perro p : perros) {

            System.out.println(p);
        }
        System.out.println("\nPerrros juegan y comen");
        //cambiar los atributos dentro de la lista (realizando sus métodos)
        for (Perro p : perros) {

            p.jugar();
            p.comer();

        }

        // Mostramos el estado final de todos los perros:
        System.out.println("\nEstado Final de los perros");
        for (Perro p : perros) {

            System.out.println(p);

        }


    }
}