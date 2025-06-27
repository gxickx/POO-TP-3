package modelos;

public class Perro {

    // atributos o estados privados
    private String nombre;
    private int felicidad;
    private int hambre;
    private int energia;

    // constructor devuelve una instancia del objeto que se está creando
    public Perro (String nombre, int felicidad, int hambre, int energia) {
        this.nombre = nombre;
        this.felicidad = felicidad;
        this.hambre = hambre;
        this.energia = energia;
    }
    //Constructor que hizo el profe

    public Perro(){
        felicidad = 30;
        hambre = 0;
        energia = 20;

    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFelicidad() {
        return felicidad;
    }
    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public int getHambre() {
        return hambre;
    }
    public void setHambre(int hambre) {
        this.hambre = hambre;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    // Metodo privado Ladrar
    private void ladrar() {
        System.out.println("Guau Guau");
    }

    // Metodos publicos
    // El this.Atributo no es necesario en este caso, ya que no hay conflictos en este ejercicio particular

    public void comer (){

        if (hambre > 0) {
            this.hambre --;
            this.felicidad ++;
            ladrar();
        }
    }

    public void jugar(){
        this.felicidad ++;
        this.energia --;
        ladrar();
    }

    public void dormir(){
        this.energia ++;
        this.hambre ++;

    }

    // Metodo to string

    public String toString(){
        return " Nombre:" + nombre + " Felicidad: " + felicidad + " Hambre: " + hambre + " Energia: " + energia;

    }

}
