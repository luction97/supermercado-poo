package com.empresa.supermercado.contenedores;

import com.empresa.supermercado.IProducto;
import com.empresa.supermercado.contenedores.enums.TipoContenedor;

public class Caja extends Contenedor {
    // Cuando vamos a obtener una caja, necesitamos saber sus medidas

    private int ancho;
    private int largo;


    public Caja(String referencia, int alto, int ancho, int largo) {
        super(referencia, alto, 0);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getSuperficie() {
        return ancho * largo;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

    @Override
    public boolean resiste(IProducto producto){
        return true;
    }


}
