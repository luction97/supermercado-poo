package com.empresa.supermercado;

import com.empresa.supermercado.contenedores.enums.TipoContenedor;

import java.util.Set;

public interface IContenedor {
    String getReferencia();

    int getVolumen();

    int volumenDisponible();

    int getSuperficie();

    int getResistencia();

    Set<IProducto> getProductos();

    TipoContenedor getTipo();

    boolean agregar(IProducto producto);

    boolean resiste(IProducto producto);

}
