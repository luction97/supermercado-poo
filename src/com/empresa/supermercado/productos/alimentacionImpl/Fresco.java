package com.empresa.supermercado.productos.alimentacionImpl;

import com.empresa.supermercado.Caducable;
import com.empresa.supermercado.productos.Alimentacion;

import java.time.LocalDate;

public class Fresco extends Alimentacion implements Caducable {

    private LocalDate caducidad;

    public Fresco(String referencia, int peso, int volumen, LocalDate caducidad) {
        super(referencia, peso, volumen);
    }


    @Override
    public boolean estaCaducado() {
        return caducidad.isBefore(LocalDate.now());
    }
}
