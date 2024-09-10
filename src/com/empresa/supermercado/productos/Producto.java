package com.empresa.supermercado.productos;

import com.empresa.supermercado.IContenedor;
import com.empresa.supermercado.IProducto;
import com.empresa.supermercado.contenedores.Contenedor;

public abstract class Producto implements IProducto {

    private String referencia;
    private int peso;
    private int volumen;

    public Producto(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tieneEspacio(IContenedor contenedor) {
        return contenedor.volumenDisponible() > volumen;
    }

    @Override
    public void agregar(Contenedor contenedor){

    }
}
