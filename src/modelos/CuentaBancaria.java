package modelos;

public class CuentaBancaria {

    private int ID;
    private String nombre;
    private String apellido;
    private Double saldoInicial;
    private Double limite;

    // Constructor
    public CuentaBancaria(int ID, String nombre, String apellido, Double saldoInicial, Double limite) {

        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldoInicial = saldoInicial;
        this.limite = limite;

    }

    // Getters y Setters

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //Metodos

    public void depositar(Double valor) {
        if (valor > 0) {
            this.saldoInicial += valor;
        } else {
            System.out.println("No se puede depositar un monto negativo.");
        }
    }

    public boolean retirar(Double valor) {
        if (saldoInicial - valor >= -limite) {

            this.saldoInicial -= valor;
            return true;

        } else {

            return false; // no se pudo extraer

        }

    }


    public boolean transferencia(Double valor, CuentaBancaria destino) {
        if (saldoInicial - valor >= -limite) {
            this.saldoInicial -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneFondosSuficientes(Double valor) {
        return saldoInicial - valor >= -limite;
    }

    public String obtenerInformacionCuenta (){

        return "Titular: " + nombre + " " + apellido + " Saldo: " + saldoInicial + " Limite: " + limite;

    }


}
