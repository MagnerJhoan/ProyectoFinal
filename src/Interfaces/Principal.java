/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable; // Importa la interfaz Serializable para permitir la serialización de objetos
import java.util.ArrayList; // Importa la clase ArrayList del paquete java.util para crear listas dinámicas
/**
 *
 * @author MAGNER
 */
/**
 * Clase Principal que representa la gestión principal del programa.
 * Implementa la interfaz Serializable para permitir la serialización.
 */
public class Principal implements Serializable {
     public ArrayList<Cuenta> listaCuenta; // Lista de cuentas
     public ArrayList<Cliente> listaCliente; // Lista de clientes
    
    /**
     * Constructor de la clase Principal.
     * Inicializa las listas de cuentas y clientes.
     */
    public Principal() {
        listaCuenta = new ArrayList<>(); // Inicializa la lista de cuentas
        listaCliente = new ArrayList<>(); // Inicializa la lista de clientes
    }
    
    /**
     * Método para obtener la lista de clientes.
     * @return La lista de clientes.
     */
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente; // Devuelve la lista de clientes
    }

    /**
     * Método para establecer la lista de clientes.
     * @param listaClientes La lista de clientes a establecer.
     */
    public void setListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaCliente = listaClientes; // Establece la lista de clientes
    }
    
    /**
     * Método para obtener la lista de cuentas.
     * @return La lista de cuentas.
     */
    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta; // Devuelve la lista de cuentas
    }

    /**
     * Método para establecer la lista de cuentas.
     * @param listaCuentas La lista de cuentas a establecer.
     */
    public void setListaCuenta(ArrayList<Cuenta> listaCuentas) {
        this.listaCuenta = listaCuentas; // Establece la lista de cuentas
    }
}
