import modelos.CuentaBancaria;

public class Ejercicio3 {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(1, "Andrea", "Lopez", 0.0, 500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria(2, "Luis", "Torres", 0.0, 200.0);

        System.out.println(cuenta1.obtenerInformacionCuenta());
        System.out.println(cuenta2.obtenerInformacionCuenta());

        // operaciones
        cuenta1.depositar(500.0);
        cuenta1.retirar(2000.0);
        cuenta1.retirar(100.0);

        cuenta1.transferencia(300.0, cuenta2); // se transfiere desde cuenta1 a cuenta2

        System.out.println(cuenta1.obtenerInformacionCuenta());
        System.out.println(cuenta2.obtenerInformacionCuenta());

        // verificar fondos
        if (cuenta2.tieneFondosSuficientes(600.0)) {
            System.out.println("Cuenta 2 tiene fondos suficientes para operar.");
        } else {
            System.out.println("Cuenta 2 NO tiene fondos suficientes.");
        }
    }


}

