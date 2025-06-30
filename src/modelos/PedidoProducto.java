package modelos;
/*En un sistema de e-commerce, se debe modelar una clase que represente un pedido de productos.
Cada pedido tiene un número único, una fecha de creación,

una lista de productos (cada uno con nombre y precio) y

un estado que puede ser NUEVO, PAGADO, ENVIADO, ENTREGADO o CANCELADO.

El sistema debe permitir agregar productos únicamente cuando el pedido esté en
estado NUEVO, y deberá controlar la transición entre estados respetando el flujo válido: NUEVO
→ PAGADO → ENVIADO → ENTREGADO.

Se podrá cancelar un pedido solo si se encuentra en
estado NUEVO o PAGADO.

Además, debe implementarse un métod que calcule el total del pedido sumando los precios de todos los productos incluidos.

Dibuje el diagrama UML para la clase, luego debe implementarla y demostrar su uso.*/

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoProducto {
    private int idPedido;
    private LocalDate fechaCreacion;
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private String estado;

    public PedidoProducto(int idPedido, LocalDate fechaCreacion, ArrayList<Producto> listaProductos, String estado) {
        this.idPedido = idPedido;
        this.fechaCreacion = fechaCreacion;
        this.listaProductos = listaProductos;
        this.estado = estado;
    }

    // getters y setters
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // metodos
    // agregar productos unicamente si el estado es NUEVO

    public void agregarProducto(Producto producto, ArrayList<Producto> listaProductos) {
        if (this.estado.equals("NUEVO")) {
            listaProductos.add(producto);
        } else {
            System.out.println("El pedido debe estar en estado NUEVO. Estado actual:" + this.estado);
        }

    }

    //controlar la transición entre estados respetando el flujo válido: NUEVO → PAGADO → ENVIADO → ENTREGADO.
    public void cambiarEstado(String estado) {

    }

    //cancelar pedido solo si se encuentra en estado NUEVO o PAGADO


    //metodo que sume todos los precios de los productos en la lista


}
