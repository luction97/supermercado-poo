package com.empresa.supermercado.contenedores;

import com.empresa.supermercado.contenedores.enums.TipoContenedor;

public class Bolsa extends Contenedor {

    int ancho;

    public Bolsa(String referencia, int ancho, int resistencia) {
        super(referencia, ancho, resistencia);
        this.ancho = ancho;
    }

    @Override
    public int getSuperficie() {
        int radio = getDiametro() / 2;
        return (int) (Math.PI * radio * radio);
    }

    private int getDiametro() {
        return (int) ((2 * ancho) / Math.PI);
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }

}
