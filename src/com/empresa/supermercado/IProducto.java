package com.empresa.supermercado;

import com.empresa.supermercado.contenedores.Contenedor;
import com.empresa.supermercado.contenedores.enums.Categoria;

public interface IProducto {


    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);
    boolean tieneEspacio(IContenedor contenedor);

    void agregar(Contenedor contenedor);
}
