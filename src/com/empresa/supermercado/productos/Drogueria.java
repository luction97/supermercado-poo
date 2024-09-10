package com.empresa.supermercado.productos;

import com.empresa.supermercado.IProducto;
import com.empresa.supermercado.contenedores.enums.Categoria;

public class Drogueria extends Producto {

    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.DROGUERIA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
